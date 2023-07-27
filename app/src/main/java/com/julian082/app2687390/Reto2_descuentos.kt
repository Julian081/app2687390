package com.julian082.app2687390

class Reto2_descuentos {
}
fun calcularDescuento(valorCompra: Double, bolita: String): Pair<Double, Double> {
    val descuento: Double
    when (bolita) {
        "roja" -> descuento = 0.1
        "azul" -> descuento = 0.3
        "amarilla" -> descuento = 0.5
        "blanca" -> descuento = 1.0
        else -> {
            println("Bolita inválida, no se aplicará descuento.")
            return Pair(0.0, valorCompra)
        }
    }

    val descuentoAplicado = valorCompra * descuento
    val valorFinalAPagar = valorCompra - descuentoAplicado
    return Pair(descuentoAplicado, valorFinalAPagar)
}

fun main() {
    val readLine = generateSequence(::readLine)
    val scanner = readLine.iterator()

    println("¡Bienvenido a Supermercados Noé!")
    println("Estamos de aniversario y te obsequiamos un descuento en tu compra.")
    println("Si el valor de tu compra es mayor a 50.000 y dependiendo de la bolita obtenida de forma aleatoria, podrías recibir un descuento especial.")

    print("Ingresa el valor de tu compra: ")
    val valorCompra = scanner.next().toDoubleOrNull()

    if (valorCompra != null && valorCompra > 50000) {
        val bolitas = listOf("roja", "azul", "amarilla", "blanca")
        val bolitaAleatoria = bolitas.shuffled().first()

        println("\n¡Felicidades! Obtuviste una bolita $bolitaAleatoria.")
        val (descuentoAplicado, valorFinalAPagar) = calcularDescuento(valorCompra, bolitaAleatoria)

        if (descuentoAplicado > 0) {
            println("Obtuviste un descuento del ${descuentoAplicado * 100}% en el valor de tu compra.")
            println("Valor final a pagar: $valorFinalAPagar")
        } else {
            println("No se aplicará descuento.")
        }
    } else {
        println("El valor de compra debe ser mayor a 50.000 para obtener un descuento.")
    }
}