package com.example.leagueoflegend

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.leagueoflegend.ui.theme.PersonajesLol

@Composable
fun ScreenDetails(modifier: Modifier,
                  id:Int){
    Surface(modifier = modifier ) {
        val personaje = PersonajesRepo.cogerPersonajes().first { it.id == id }
        personaje.nombre
        personaje.imagen
    }

}