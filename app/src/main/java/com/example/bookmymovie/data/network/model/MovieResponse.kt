import com.example.bookmymovie.data.model.MovieItemDto
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("id") val id: Int? = null,
    @SerializedName("title") val title: String? = null,
    @SerializedName("year") val year: Int? = null,
    @SerializedName("genre") val genre: List<String>? = null,
    @SerializedName("rating") val rating: Double? = null,
    @SerializedName("director") val director: String? = null,
    @SerializedName("actors") val actors: List<String>? = null,
    @SerializedName("plot") val plot: String? = null,
    @SerializedName("poster") val poster: String? = null,
    @SerializedName("trailer") val trailer: String? = null,
    @SerializedName("runtime") val runtime: Int? = null,
    @SerializedName("awards") val awards: String? = null,
    @SerializedName("country") val country: String? = null,
    @SerializedName("language") val language: String? = null,
    @SerializedName("boxOffice") val boxOffice: String? = null,
    @SerializedName("production") val production: String? = null,
    @SerializedName("website") val website: String? = null
)

fun MovieResponse.toDomain(): MovieItemDto {
    return MovieItemDto(
        id = this.id ?: 0,
        title = this.title.orEmpty(),
        year = this.year ?: 0,
        genre = this.genre.orEmpty(),
        rating = this.rating ?: 0.0,
        director = this.director.orEmpty(),
        actors = this.actors.orEmpty(),
        plot = this.plot.orEmpty(),
        poster = this.poster.orEmpty(),
        trailer = this.trailer.orEmpty(),
        runtime = this.runtime ?: 0,
        awards = this.awards.orEmpty(),
        country = this.country.orEmpty(),
        language = this.language.orEmpty(),
        boxOffice = this.boxOffice.orEmpty(),
        production = this.production.orEmpty(),
        website = this.website.orEmpty()
    )
}

fun List<MovieResponse>.toDomain(): List<MovieItemDto> {
    return this.map { it.toDomain() }
}