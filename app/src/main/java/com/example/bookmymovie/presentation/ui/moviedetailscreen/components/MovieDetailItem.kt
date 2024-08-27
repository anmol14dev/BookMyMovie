package com.example.bookmymovie.presentation.ui.moviedetailscreen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.bookmymovie.data.model.MovieItemDto
import com.example.bookmymovie.utils.Constants

@Composable
fun MovieDetailItem(movie: MovieItemDto) {
    AsyncImage(
        model = Constants.DEFAULT_IMG_URL,
        contentDescription = movie.title,
        contentScale = ContentScale.FillBounds,
        alignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(360.dp)
            .clip(
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp,
                    bottomStart = 16.dp,
                    bottomEnd = 16.dp
                )
            )
    )
    Text(
        text = movie.title ?: "Unknown Title",
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier.padding(top = 16.dp)
    )
    Text(
        text = movie.plot ?: "",
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(top = 16.dp)
    )

}