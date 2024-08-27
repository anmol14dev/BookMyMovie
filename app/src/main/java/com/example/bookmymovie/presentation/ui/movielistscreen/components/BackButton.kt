package com.example.bookmymovie.presentation.ui.movielistscreen.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.bookmymovie.utils.Constants

@Composable
fun BackButton(navController: NavController) {
    IconButton(onClick = { navController.popBackStack() }) {
        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = Constants.BACK_ICON)
    }
}