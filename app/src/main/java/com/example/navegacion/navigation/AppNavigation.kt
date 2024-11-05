package com.example.navegacion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacion.screen.MovieDetailScreen
import com.example.navegacion.screen.MoviesScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Screens.MoviesScreen.route
    ) {
        composable(Screens.MoviesScreen.route) {
            MoviesScreen(
                onClick = {
                    navController.navigate(Screens.MovieDetailScreen.route)
                }
            )
        }
        composable(Screens.MovieDetailScreen.route) {
            MovieDetailScreen(
                onBackPressed = {
                    navController.popBackStack()
                }
            )
        }
    }
}


