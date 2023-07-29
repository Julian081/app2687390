import java.util.Scanner

data class Auto(var marca: String, var modelo: String)

val autosRegistrados = mutableListOf<Auto>()

fun mostrarAutos() {
    println("\nAutos registrados:")
    autosRegistrados.forEachIndexed { index, auto ->
        println("${index + 1}. Marca: ${auto.marca}, Modelo: ${auto.modelo}")
    }
}

fun buscarAuto() {
    print("\nIngrese la marca del auto que desea buscar: ")
    val marcaBuscada = readLine()
    val autoEncontrado = autosRegistrados.find { it.marca.equals(marcaBuscada, ignoreCase = true) }
    if (autoEncontrado != null) {
        println("Auto encontrado - Marca: ${autoEncontrado.marca}, Modelo: ${autoEncontrado.modelo}")
    } else {
        println("Auto no encontrado.")
    }
}

fun modificarAuto() {
    print("\nIngrese la marca del auto que desea modificar: ")
    val marcaBuscada = readLine()
    val autoEncontrado = autosRegistrados.find { it.marca.equals(marcaBuscada, ignoreCase = true) }
    if (autoEncontrado != null) {
        print("Ingrese el nuevo nombre de la marca: ")
        val nuevaMarca = readLine()
        autoEncontrado.marca = nuevaMarca ?: ""
        println("Marca de auto modificada correctamente.")
    } else {
        println("Auto no encontrado.")
    }
}

fun eliminarAuto() {
    print("\nIngrese la marca del auto que desea eliminar: ")
    val marcaBuscada = readLine()
    val autoEncontrado = autosRegistrados.find { it.marca.equals(marcaBuscada, ignoreCase = true) }
    if (autoEncontrado != null) {
        autosRegistrados.remove(autoEncontrado)
        println("Auto eliminado correctamente.")
    } else {
        println("Auto no encontrado.")
    }
}

fun registrarAuto() {
    print("\nIngrese la marca del auto: ")
    val marca = readLine() ?: ""
    print("Ingrese el modelo del auto: ")
    val modelo = readLine() ?: ""
    val nuevoAuto = Auto(marca, modelo)
    autosRegistrados.add(nuevoAuto)
    println("Auto registrado correctamente.")
}

fun menu() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("\n------ Menú ------")
        println("1. Mostrar autos registrados")
        println("2. Buscar un auto")
        println("3. Modificar el nombre de un auto")
        println("4. Eliminar un auto")
        println("5. Registrar un auto")
        println("6. Salir")

        print("Ingrese el número de la opción que desea realizar: ")
        val opcion = scanner.nextInt()

        when (opcion) {
            1 -> mostrarAutos()
            2 -> buscarAuto()
            3 -> modificarAuto()
            4 -> eliminarAuto()
            5 -> registrarAuto()
            6 -> {
                println("¡Hasta luego!")
                return
            }
            else -> println("Opción inválida. Por favor, ingrese una opción válida.")
        }
    }
}

fun main() {
    menu()
}
