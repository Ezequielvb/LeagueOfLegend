package com.example.leagueoflegend

import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.leagueoflegend.nav.detail
import com.example.leagueoflegend.nav.home
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

        NavHost(
            navController = navController,
            startDestination = home
        )
        {
            composable<home> {
                Scaffold(topBar =
                    {

                        TopAppBar(
                            title = {
                                Text(text = "Personajes LOL")
                            }
                        )

                    }) { innerPadding ->

                    LolListaPerso(
                        modifier = Modifier.padding(innerPadding),
                        onNavigateToDetail = { id -> navController.navigate(detail(id = id)) })
                }
            }
            composable <detail> {backStackEntry ->
                val id:detail = backStackEntry.toRoute()
                DetailsScreen(modifier = Modifier,id = id)

            }
        }


    }


@Composable
fun DetailsScreen(modifier: Modifier, id: detail) {
    Scaffold { innerPadding ->
        ScreenDetails(modifier = modifier.padding(innerPadding), id = id)
    }

}






