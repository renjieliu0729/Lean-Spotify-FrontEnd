# Kotlin Spotify App

This is a fully functional Spotify-like application, built using Kotlin and leveraging the robust Android Jetpack libraries. The application features a sleek user interface and seamless navigation, providing an excellent user experience similar to that of the official Spotify app.

## Features

- **Seamless Navigation**: Implemented with Jetpack Navigation component, the app offers intuitive user experience through a bottom navigation bar, making app interactions smooth and straightforward.
- **Mock RESTful APIs**: Utilizes Ktor to create mock APIs, with Retrofit handling network requests and automating response parsing, thus increasing the efficiency of data management.
- **Modern UI with Jetpack Compose**: The interface for browsing feeds, albums, and favorites is designed using Jetpack Compose, following the MVVM architectural pattern to promote clean, maintainable, and scalable code.
- **Local Caching**: Features local caching of favorites using the Room Database, enhancing the app's performance and offline capabilities.

## Technologies Used

- **Kotlin**: Primary programming language, offering modern language features that enhance productivity and readability.
- **Android Jetpack Libraries**: Utilized for efficient app development practices, including Navigation for managing UI components and ViewModel for lifecycle-aware data handling.
- **Hilt**: For dependency injection, providing a scalable way to manage object creation and lifecycle.
- **Room Database**: Manages SQLite database handling with an abstraction layer for robust data persistence.
- **Ktor & Retrofit**: Networking handled by Ktor for mock API creation and Retrofit for seamless data fetching and parsing.
