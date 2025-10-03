package com.example.leagueoflegend

object PersonajesRepo {
    fun cogerPersonajes(): List<Personaje>{
        return listOf(
            Personaje(R.drawable.annie,
                "Annie",
                "Annie es una niña maga que controla el fuego y convoca a Tibbers, su oso gigante."),
            Personaje(R.drawable.diana,
                "Diana",
                "Diana es una guerrera lunar que empuña una hoja de luna creciente y canaliza el poder de la luna."),
            Personaje(R.drawable.fizz,
                "Fizz",
                "Fizz es un travieso habitante del océano que lucha con una lanza y convoca a un tiburón gigante."),
            Personaje(R.drawable.irelia,
                "Irelia",
                "Irelia es una bailarina guerrera que controla cuchillas con gracia letal para defender Jonia."),
            Personaje(R.drawable.leona,
                "Leona",
                "Leona es una guerrera solar que protege con escudo y espada, canalizando el poder del sol."),
            Personaje(R.drawable.mordekaiser,
                "Mordekaiser",
                "Mordekaiser es un señor de la muerte que domina el reino de los muertos con fuerza imparable y magia oscura."),
            Personaje(R.drawable.neeko,
                "Neeko",
                "Neeko es una camaleónica habitante del bosque que puede transformarse en otros y lanza magia ilusoria."),
            Personaje(R.drawable.senna,
                "Senna",
                "Senna es una tiradora espectral que lucha con luz y oscuridad, liberando almas con su relicario."),
            Personaje(R.drawable.taric,
                "Taric",
                "Taric es el protector cósmico que canaliza el poder de las estrellas para defender con belleza y fuerza."),
            Personaje(R.drawable.teemo,
                "Temmo",
                "Teemo es un explorador yódl que usa trampas y dardos venenosos para defender su territorio con astucia."),
            Personaje(R.drawable.vi,
                "Vi",
                "Vi es una excriminal de Zaun que combate con poderosos guanteletes hextech y una actitud imparable."),
            Personaje(R.drawable.ziggs,
                "Ziggs",
                "Ziggs es un yódl explosivo que lanza bombas con entusiasmo caótico y una risa contagiosa."),
        )
    }
}