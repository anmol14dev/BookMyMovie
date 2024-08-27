package com.example.bookmymovie.data.repository


import MovieResponse
import com.example.bookmymovie.data.model.MovieItemDto
import com.example.bookmymovie.data.network.model.ResultModel
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface MovieRepository {
    suspend fun fetchMovies(): Flow<ResultModel<List<MovieItemDto>>>

    suspend fun fetchMoviesBasedOnQuery(query: String): Flow<ResultModel<List<MovieItemDto>>>
}