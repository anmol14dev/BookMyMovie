import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import com.example.bookmymovie.presentation.ui.movielistscreen.components.BackButton
import com.example.bookmymovie.utils.Constants

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.bookmymovie.presentation.ui.movielistscreen.viewmodel.MainScreenViewModel
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bookmymovie.data.model.MovieItemDto
import com.example.bookmymovie.presentation.ui.moviedetailscreen.components.MovieDetailItem

@Composable
fun MovieDetailScreen(navController: NavController, movie: MovieItemDto) {
    Column(modifier = Modifier.padding(16.dp).fillMaxSize()) {
        Row {
            BackButton(navController = navController)
        }
            MovieDetailItem(movie = movie)
    }
}