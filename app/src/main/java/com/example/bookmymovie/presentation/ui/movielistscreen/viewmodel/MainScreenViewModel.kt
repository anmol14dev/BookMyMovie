package com.example.bookmymovie.presentation.ui.movielistscreen.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookmymovie.data.model.MovieItemDto
import com.example.bookmymovie.data.network.model.ResultModel
import com.example.bookmymovie.data.repository.MovieRepository
import com.example.bookmymovie.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val movieRepository: MovieRepository
) : ViewModel() {

    private val _moviesState = MutableStateFlow<MovieListState>(MovieListState.Loading)
    val moviesState = _moviesState.asStateFlow()
    private val _query = MutableStateFlow("")
    val query: StateFlow<String> = _query

    init {
        viewModelScope.launch {
            query.debounce(200).collect { query ->
                if (query.isEmpty()) {
                    fetchMovies()
                } else {
                    fetchMoviesBasedOnQuery(query)
                }
            }
        }
    }

    fun fetchMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            movieRepository.fetchMovies().collect { result ->
                when (result.status) {
                    ResultModel.Status.SUCCESS -> {
                        _moviesState.value = MovieListState.Success( result.data ?: emptyList())
                    }

                    ResultModel.Status.ERROR -> {
                        _moviesState.value = MovieListState.Error
                    }

                    ResultModel.Status.LOADING -> {
                        _moviesState.value = MovieListState.Loading
                    }
                }
            }
        }
    }

    fun updateQuery(query: String) {
        _query.value = query
    }

    private fun fetchMoviesBasedOnQuery(query: String) {
        viewModelScope.launch(Dispatchers.IO) {
            movieRepository.fetchMoviesBasedOnQuery(query).collect { result ->
                when (result.status) {
                    ResultModel.Status.SUCCESS -> {
                        _moviesState.value = MovieListState.Success( result.data ?: emptyList())
                    }

                    ResultModel.Status.ERROR -> {
                        _moviesState.value = MovieListState.Error
                    }

                    ResultModel.Status.LOADING -> {
                        _moviesState.value = MovieListState.Loading
                    }
                }
            }
        }
    }
}

sealed class MovieListState {
    object Loading : MovieListState()
    data class Success(val movies: List<MovieItemDto>) : MovieListState()
    object Error : MovieListState()
}