
package com.example.bookmymovie.data.network.service

import MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {
    @GET("api/v1/movies")
    suspend fun fetchMovies(): Response<List<MovieResponse>>

    @GET("api/v1/movies")
    suspend fun fetchMoviesBasedOnQuery(@Query("search")query: String):
            Response<List<MovieResponse>>
}