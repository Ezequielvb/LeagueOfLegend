package com.example.leagueoflegend

object PersonajesRepo {
    fun cogerPersonajes(): List<Personaje>{
        return listOf(
            Personaje(R.drawable.annie,
                "Annie",
                "Personaje de ataque 1"),
            Personaje(R.drawable.diana,
                "Diana",
                "Personaje de ataque 2"),
            Personaje(R.drawable.fizz,
                "Fizz",
                "Personaje de ataque 3"),
            Personaje(R.drawable.irelia,
                "Irelia",
                "Personaje de ataque 4"),
            Personaje(R.drawable.leona,
                "Leona",
                "Personaje de ataque 5"),
            Personaje(R.drawable.mordekaiser,
                "Mordekaiser",
                "Personaje de ataque 6"),
            Personaje(R.drawable.neeko,
                "Neeko",
                "Personaje de ataque 7"),
            Personaje(R.drawable.senna,
                "Senna",
                "Personaje de ataque 8"),
            Personaje(R.drawable.taric,
                "Taric",
                "Personaje de ataque 9"),
            Personaje(R.drawable.teemo,
                "Temmo",
                "Personaje de ataque 10"),
            Personaje(R.drawable.vi,
                "Vi",
                "Personaje de ataque 11"),
            Personaje(R.drawable.ziggs,
                "Ziggs",
                "Personaje de ataque 12"),
        )
    }
}