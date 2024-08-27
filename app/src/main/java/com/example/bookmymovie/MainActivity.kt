package com.example.bookmymovie

import MovieDetailScreen
import MovieListScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.bookmymovie.data.model.MovieItemDto
import com.example.bookmymovie.presentation.navigation.utils.NavArguments
import com.example.bookmymovie.presentation.navigation.utils.Routes
import com.example.bookmymovie.presentation.navigation.utils.Screens
import com.example.bookmymovie.presentation.ui.theme.BookMyMovieTheme
import com.example.bookmymovie.presentation.ui.movielistscreen.viewmodel.MainScreenViewModel
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookMyMovieTheme {
                val viewModel = hiltViewModel<MainScreenViewModel>()
                viewModel.fetchMovies()
                Surface {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Screens.Main.route) {
                        composable(Screens.Main.route) {
                            MovieListScreen(navController = navController)
                        }
                        composable(
                            route = Screens.Detail.route + Routes.DETAIL_SCREEN_ROUTE,
                            arguments = listOf(navArgument(NavArguments.MOVIE) { type = NavType
                                .StringType })
                        ) { backStackEntry ->
                            val movieJson = backStackEntry.arguments?.getString(NavArguments.MOVIE)
                            val movie = Gson().fromJson(movieJson, MovieItemDto::class.java)
                            MovieDetailScreen(
                                navController,
                                movie
                            )
                        }
                    }
                }
            }
        }
    }
}