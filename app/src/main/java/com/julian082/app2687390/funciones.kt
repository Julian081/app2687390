package com.julian082.app2687390

class funciones {
}

/*fun main() {
     // funsciones
    var temperatura=20
    var ishot=if(temperatura>40) true else false
    print(ishot)


fun main() {
    var edad =18
    var si_no =if (edad<=18){
        print("si puedes ")
    }else{
        println("no puedes")
    }
}


fun holaxd(){
    println("hola mundo")
}
fun CalPerimetroCirsulo(){

}
fun calcularAreaCirculo(){

}

fun main() {
    holaxd()
}}
fun calcularPerimetroCirculo(radio: Double): Double {
    return 2 * 3.141592653589793 * radio
}

fun calcularAreaCirculo(radio: Double): Double {
    return 3.141592653589793 * radio * radio
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)

    while (true) {
        println("1. Calcular perímetro de círculo")
        println("2. Calcular área de círculo")
        println("3. Salir")
        print("Ingrese el número de la opción que desea realizar: ")
        val opcion = scanner.nextInt()
        when (opcion) {
            1 -> {
                print("Ingrese el radio del círculo: ")
                val radio = scanner.nextDouble()
                val perimetro = calcularPerimetroCirculo(radio)
                println("El perímetro del círculo es: $perimetro")
            }
            2 -> {
                print("Ingrese el radio del círculo: ")
                val radio = scanner.nextDouble()
                val area = calcularAreaCirculo(radio)
                println("El área del círculo es: $area")
            }
            3 -> {
                println("¡Hasta luego!")

            }
            else -> println("Opción inválida. Por favor, ingrese una opción válida.")
        }
    }
}
fun calcularPerimetroTriangulo(lado1: Double, lado2: Double, lado3: Double): Double {
    return lado1 + lado2 + lado3
}

fun calcularAreaTriangulo(lado1: Double, lado2: Double, lado3: Double): Double {
    val semiperimetro = (lado1 + lado2 + lado3) / 2
    return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3))
}
fun tipoTriangulo(){


}
fun main() {
    val scanner = java.util.Scanner(System.`in`)

    while (true) {
        println("1. Calcular perímetro de triángulo")
        println("2. Calcular área de triángulo")
        println("3. Salir")

        print("Ingrese el número de la opción que desea realizar: ")
        val opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                print("Ingrese el lado 1 del triángulo: ")
                val lado1 = scanner.nextDouble()
                print("Ingrese el lado 2 del triángulo: ")
                val lado2 = scanner.nextDouble()
                print("Ingrese el lado 3 del triángulo: ")
                val lado3 = scanner.nextDouble()
                val perimetro = calcularPerimetroTriangulo(lado1, lado2, lado3)
                println("El perímetro del triángulo es: $perimetro")
            }
            2 -> {
                print("Ingrese el lado 1 del triángulo: ")
                val lado1 = scanner.nextDouble()
                print("Ingrese el lado 2 del triángulo: ")
                val lado2 = scanner.nextDouble()
                print("Ingrese el lado 3 del triángulo: ")
                val lado3 = scanner.nextDouble()
                val area = calcularAreaTriangulo(lado1, lado2, lado3)
                println("El área del triángulo es: $area")
            }
            3 -> {
                println("gracias")
                return
            }
            else -> println("Opción inválida. Por favor, ingrese una opción válida.")
        }
    }
}*/
fun calcularPerimetroRectangulo(base: Double, altura: Double): Double {
    return 2 * (base + altura)
}

fun calcularAreaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)

    while (true) {
        println("1. Calcular perímetro de rectángulo")
        println("2. Calcular área de rectángulo")
        println("3. Salir")
        //

        print("ingrese el numero de lo que quiere hacer ")
        val opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                print("Ingrese la base del rectángulo: ")
                val base = scanner.nextDouble()
                print("Ingrese la altura del rectángulo: ")
                val altura = scanner.nextDouble()
                val perimetro = calcularPerimetroRectangulo(base, altura)
                println("El perímetro del rectángulo es: $perimetro")
            }
            2 -> {
                print("Ingrese la base del rectángulo: ")
                val base = scanner.nextDouble()
                print("Ingrese la altura del rectángulo: ")
                val altura = scanner.nextDouble()
                val area = calcularAreaRectangulo(base, altura)
                println("El área del rectángulo es: $area")
            }
            3 -> {
                println("¡Hasta luego recuerda eres el mejor programado del mundo!")
                return
            }
            else -> println("bruto pon una occion valida")
        }
    }
}