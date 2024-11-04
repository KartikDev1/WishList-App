package com.example.mywishlistapp

sealed class Screen (val route:String){
    object HomesScreen : Screen("home_screen")
    object AddScreen : Screen("add_screen")


}