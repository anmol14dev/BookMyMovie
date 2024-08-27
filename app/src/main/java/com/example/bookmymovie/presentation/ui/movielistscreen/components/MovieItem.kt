import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.bookmymovie.data.model.MovieItemDto
import com.example.bookmymovie.utils.Constants

@Composable
fun MovieItem(movie: MovieItemDto, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = onClick)
    ) {
        AsyncImage(
            model = Constants.DEFAULT_IMG_URL, contentDescription = Constants.MOVIE_POSTER, alignment =
            Alignment.Center,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(172.dp)
                .height(172.dp)
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
            text = movie.title,
            modifier = Modifier.padding(8.dp),
            style = MaterialTheme.typography.titleMedium
        )
    }
}