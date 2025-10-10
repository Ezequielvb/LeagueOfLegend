package com.example.leagueoflegend.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.leagueoflegend.Personaje
import com.example.leagueoflegend.PersonajesRepo

@Composable
fun PersonajesLol(personaje: Personaje, onNavigatetoDetails: () -> Unit){
    Row (

        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().border(2.dp,Color.Black).padding(10.dp)
            .clickable(onClick = onNavigatetoDetails, enabled = true)

    ) {

        Image(
            modifier = Modifier.size(40.dp).clip(CircleShape),
            painter = painterResource(personaje.imagen),
            contentDescription = "Imagen del personaje",
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier.padding(start = 16.dp)
        ){
            Text(text = personaje.nombre, style = MaterialTheme.typography.titleMedium)
            Text(text = personaje.descripcion)
        }
    }
}

@Composable
fun LolListaPerso(modifier: Modifier = Modifier,
                  onNavigateToDetail: () ->Unit ){
    val personajes : List<Personaje> = PersonajesRepo.cogerPersonajes()
    LazyColumn(modifier = modifier) {
        items(
            items = personajes,
            key = {it.nombre}
        ){
                personaje->
            PersonajesLol(
                personaje = personaje,
                onNavigateToDetail
            )
        }
    }
}