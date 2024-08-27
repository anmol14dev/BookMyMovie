import android.net.Uri
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.bookmymovie.presentation.navigation.utils.Screens
import com.example.bookmymovie.presentation.ui.movielistscreen.components.MovieListResult
import com.example.bookmymovie.presentation.ui.movielistscreen.components.SearchBar
import com.example.bookmymovie.presentation.ui.movielistscreen.viewmodel.MainScreenViewModel
import com.example.bookmymovie.presentation.ui.movielistscreen.viewmodel.MovieListState
import com.example.bookmymovie.utils.Constants
import com.google.gson.Gson


@Composable
fun MovieListScreen(navController: NavController) {
    val viewModel = hiltViewModel<MainScreenViewModel>()
    val moviesState = viewModel.moviesState.collectAsState().value
    val query = viewModel.query.collectAsState().value
    Scaffold(
        modifier = Modifier.padding(8.dp),
        topBar = {
            SearchBar(query = query, onQueryChanged = viewModel::updateQuery)
        },
    ) { innerPadding ->
        when (moviesState) {
            is MovieListState.Loading -> {
                Text(text = Constants.LOADING, modifier = Modifier.padding(innerPadding))
            }

            is MovieListState.Success -> {
                if (moviesState.movies.isEmpty()) {
                    Text(text = Constants.NO_RESULTS, modifier = Modifier.padding(innerPadding))
                } else {
                    MovieListResult(movies = moviesState.movies , innerPadding) { index ->
                    val movie = moviesState.movies[index]
                    navController.navigate(Screens.Detail.route + "/${Uri.encode(Gson().toJson(movie))}")
                    }
                }
            }

            is MovieListState.Error -> {
                Text(text = Constants.ERROR, modifier = Modifier.padding(innerPadding))
            }
        }
    }
}