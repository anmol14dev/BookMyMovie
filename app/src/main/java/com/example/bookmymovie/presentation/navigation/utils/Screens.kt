package com.example.bookmymovie.presentation.navigation.utils

sealed class Screens(val route: String) {
    object Main : Screens("main")
    object Detail : Screens("detail")
}
