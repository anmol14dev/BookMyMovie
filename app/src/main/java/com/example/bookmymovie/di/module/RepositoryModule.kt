// app/src/main/java/com/example/bookmymovie/di/RepositoryModule.kt
package com.example.bookmymovie.di

import com.example.bookmymovie.data.repository.MovieRepository
import com.example.bookmymovie.domain.repository.MovieRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindMovieRepository(
        movieRepositoryImpl: MovieRepositoryImpl
    ): MovieRepository
}