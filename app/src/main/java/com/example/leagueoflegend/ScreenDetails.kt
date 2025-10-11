package com.example.leagueoflegend

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.leagueoflegend.nav.detail
import org.jetbrains.annotations.Async

@Composable
fun ScreenDetails(
    modifier: Modifier,
    id: detail
){
    Surface(modifier = modifier) {
        val personaje = PersonajesRepo.cogerPersonajes().first { it.id == id.id }
        Column(modifier= Modifier.fillMaxWidth().fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

            Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(personaje.imagen),
                contentDescription = "Imagen del personaje",
                contentScale = ContentScale.Crop
            )
            Text(text = personaje.nombre)

            Text(text = personaje.descripcion)

        }
    }

}