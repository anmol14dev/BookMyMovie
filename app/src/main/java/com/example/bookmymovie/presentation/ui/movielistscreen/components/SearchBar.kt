package com.example.bookmymovie.presentation.ui.movielistscreen.components

import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.bookmymovie.presentation.ui.theme.BookMyMovieTheme
import com.example.bookmymovie.utils.Constants

@Composable
fun SearchBar(
    query: String,
    onQueryChanged: (String) -> Unit,
) {
    val borderColor = if (isSystemInDarkTheme()) Color.White else Color.Gray

    TextField(
        value = query,
        onValueChange = onQueryChanged,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(1.dp,borderColor,RoundedCornerShape(8.dp)),
        placeholder = {
            Text(text = Constants.SEARCH_HINT)
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = Constants.SEARCH_ICON
            )
        },
        enabled = true,
        shape = RoundedCornerShape(topEnd = 8.dp, topStart = 8.dp, bottomEnd = 8.dp,
            bottomStart = 8.dp),
        singleLine = true,
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Search
        ),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
    )
}
