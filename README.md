# BookMyMovie

BookMyMovie is an Android application that allows users to browse and search for movies. The app is built using Kotlin and Jetpack Compose, and it leverages modern Android development practices such as Hilt for dependency injection, Coroutines for asynchronous programming, and Retrofit for network operations.

## Features

- Browse a list of movies
- Search for movies based on a query
- View detailed information about a selected movie
- Light and dark theme support
  
## APK
app_debug apk is present.
## API 
Used "https://freetestapi.com/apis/movies" . Api service.

## Screenshots

<img src = "https://github.com/user-attachments/assets/060cc93c-8eb0-41aa-b071-09aae17a9a9e" width=200/>
<img src="https://github.com/user-attachments/assets/f0dd7ccb-8204-4261-a2e3-b0daab09e90e" alt="Screenshot20240828035619BookMyMovie" width=200></img> 
<img src="https://github.com/user-attachments/assets/247e240f-60b8-4eca-9857-18eb609b2ee7" alt="Screenshot20240828031819BookMyMovie" width=200></img> 
<img src="https://github.com/user-attachments/assets/2ddc4a6d-94ab-4d93-b844-a97c44cf0cec" alt="Screenshot20240828031814BookMyMovie" width=200></img> 
<img src="https://github.com/user-attachments/assets/f0d45813-4c1a-42aa-8ca9-85ae8d614aff" alt="Screenshot20240828031803BookMyMovie" width=200></img> 
<img src="https://github.com/user-attachments/assets/9c8eced3-f076-4e8c-bdd0-49df5cc009e6" alt="Screenshot20240828031750BookMyMovie" width=200></img> 
<img src="https://github.com/user-attachments/assets/f4866311-01af-4147-8453-4fc2138b180d" alt="Screenshot20240828031743BookMyMovie" width=200></img>

## Tech Stack

- **Kotlin**: Programming language used for Android development.
- **Jetpack Compose**: Modern toolkit for building native Android UI.
- **Hilt**: Dependency injection library for Android.
- **Coroutines**: For managing background threads with simplified code and reducing needs for callbacks.
- **Retrofit**: Type-safe HTTP client for Android and Java.
- **Gson**: For JSON serialization and deserialization.
- **Coil**: For image loading

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
