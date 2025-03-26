package com.example.chatapp.nav

sealed class Screens(val route: String) {

    data object LoginScreen : Screens("screen_login")
    data object RegisterScreen: Screens("screen_register")
}