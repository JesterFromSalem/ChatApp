package com.example.chatapp.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chatapp.auth.LoginScreen
import com.example.chatapp.auth.RegisterScreen

@Composable
fun MainNav(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screens.LoginScreen.route) {
        composable(route = Screens.LoginScreen.route) {
            LoginScreen()
        }
        composable(route = Screens.RegisterScreen.route) {
            RegisterScreen()
        }
    }
}