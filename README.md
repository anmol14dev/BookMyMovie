# BookMyMovie

BookMyMovie is an Android application that allows users to browse and search for movies. The app is built using Kotlin and Jetpack Compose, and it leverages modern Android development practices such as Hilt for dependency injection, Coroutines for asynchronous programming, and Retrofit for network operations.

## Features

- Browse a list of movies
- Search for movies based on a query
- View detailed information about a selected movie
- Light and dark theme support

## Tech Stack

- **Kotlin**: Programming language used for Android development.
- **Jetpack Compose**: Modern toolkit for building native Android UI.
- **Hilt**: Dependency injection library for Android.
- **Coroutines**: For managing background threads with simplified code and reducing needs for callbacks.
- **Retrofit**: Type-safe HTTP client for Android and Java.
- **Gson**: For JSON serialization and deserialization.

## Architecture

The project follows a clean architecture approach with the following layers:

- **Presentation**: Contains UI components built with Jetpack Compose.
- **Domain**: Contains business logic and domain models.
- **Data**: Contains repositories, network services, and data models.

## Getting Started

### Prerequisites

- Android Studio Arctic Fox or later
- JDK 11 or later

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/bookmymovie.git
    ```
2. Open the project in Android Studio.
3. Build the project and run it on an Android device or emulator.

## Usage

- Launch the app to see a list of movies.
- Use the search bar to find movies based on a query.
- Tap on a movie item to view detailed information about the movie.

## Project Structure

```plaintext
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/bookmymovie/
│   │   │   ├── data/
│   │   │   ├── domain/
│   │   │   ├── presentation/
│   │   │   └── BookMyMovieApp.kt
│   │   └── res/
│   └── test/
├── build.gradle
└── settings.gradle
```

## Contributing

Contributions are welcome! Please fork the repository and use a feature branch. Pull requests are warmly welcome.


## Acknowledgements

- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
- [Retrofit](https://square.github.io/retrofit/)
- [Gson](https://github.com/google/gson)

---

Feel free to customize this README file according to your project's specific details and requirements.
