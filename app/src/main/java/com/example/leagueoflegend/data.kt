package com.example.leagueoflegend

import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.leagueoflegend.ui.theme.LolListaPerso

/**
@Composable
fun data(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen() }
        composable("details") { DetailsScreen(navController) }
    }
}*/


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar =
            {
                TopAppBar(
                    title= {
                        Text(text = "Personajes LOL")
                    }
                )
            }
    ) {innerPadding ->

        NavHost(
            navController = navController,
            startDestination = "home")
        {
            composable("home") {
                LolListaPerso(modifier = Modifier.padding(innerPadding),
                    onNavigateToDetail = { navController.navigate("details") })

            }
            composable("details") { DetailsScreen(modifier = Modifier.consumeWindowInsets
                (innerPadding).padding(innerPadding),navController, id) }
        }


    }

}
@Composable
fun DetailsScreen(modifier: Modifier = Modifier, navController: NavController, id: Int,) {
        ScreenDetails(modifier = modifier )

}






