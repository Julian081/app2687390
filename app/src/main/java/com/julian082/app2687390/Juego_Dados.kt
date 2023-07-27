package com.julian082.app2687390

class Reto_1_Juego_Dados {
}
fun tirarDados(): Int {
    return (1..6).random() + (1..6).random()
}

fun esVictoria(resultado: Int): Boolean {
    return when (resultado) {
        2, 3, 11, 12 -> true
        else -> false
    }
}

fun esDerrota(resultado: Int): Boolean {
    return when (resultado) {
        7 -> true
        else -> false
    }
}

fun main() {
    println("¡Bienvenido a Craps!")

    while (true) {
        println("Presiona 'Enter' para lanzar los dados...")
        readLine()

        val resultadoDados = tirarDados()
        println("Resultado del lanzamiento: $resultadoDados")

        when {
            esVictoria(resultadoDados) -> {
                println("Ganaste")
            }
            esDerrota(resultadoDados) -> {
                println("Perdiste")
            }
            else -> {
                println("Sigue jugando...")
            }
        }

        println("Quieres jugar otra vez (S/N)")
        val jugarOtraVez = readLine()?.uppercase()

        if (jugarOtraVez != "S") {
            println("¡Gracias por jugar mi juego siiiiuuuuuu")
            return
        }
    }
}

