package com.example.bookmymovie.presentation.ui.movielistscreen.components

import MovieItem
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bookmymovie.data.model.MovieItemDto

@Composable
fun MovieListResult(movies: List<MovieItemDto> , innerPadding:PaddingValues , onCardClick: (Int) -> Unit) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(paddingValues = innerPadding)
    ) {
        items(movies.size) { index ->
            MovieItem(movie = movies[index]){
                onCardClick(index)
            }
        }
    }
}