package com.example.bookmymovie.domain.repository

import MovieResponse
import com.example.bookmymovie.data.model.MovieItemDto
import com.example.bookmymovie.data.network.model.ResultModel
import com.example.bookmymovie.data.network.service.MovieService
import com.example.bookmymovie.data.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import toDomain
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieService: MovieService
) : MovieRepository {
    override suspend fun fetchMovies(): Flow<ResultModel<List<MovieItemDto>>> = flow {
        emit(ResultModel(status = ResultModel.Status.LOADING))
        val response = movieService.fetchMovies()
        if (response.isSuccessful) {
            response.body()?.let {
                emit(ResultModel(data = it.toDomain(), status = ResultModel.Status.SUCCESS))
            }
        } else {
            emit(ResultModel(status = ResultModel.Status.ERROR, message = response.message()))
        }
    }

    override suspend fun fetchMoviesBasedOnQuery(query: String): Flow<ResultModel<List<MovieItemDto>>> =
        flow {
            emit(ResultModel(status = ResultModel.Status.LOADING))
            val response = movieService.fetchMoviesBasedOnQuery(query)
            if (response.isSuccessful) {
                response.body()?.let {
                    emit(ResultModel(data = it.toDomain(), status = ResultModel.Status.SUCCESS))
                }
            } else {
                emit(ResultModel(status = ResultModel.Status.ERROR, message = response.message()))
            }
        }
}
