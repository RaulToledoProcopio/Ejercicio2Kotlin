package org.example

import kotlin.math.*

fun main() { //
    var opcion: Int? = null // Inicialización de la variable que almacenará la opción del menú.

    while (opcion != 0) { // Bucle que se ejecuta mientras la opción no sea 0.

        println("Menú:")
        println("1. Ejercicio 1")
        println("2. Ejercicio 2")
        println("3. Ejercicio 3")
        println("4. Ejercicio 4")
        println("5. Ejercicio 5")
        println("6. Ejercicio 6")
        println("7. Ejercicio 7")
        println("8. Ejercicio 8")
        println("9. Ejercicio 9")
        println("10. Ejercicio 10")
        println("11. Ejercicio 11")
        println("12. Ejercicio 12")
        println("13. Ejercicio 13")
        println("14. Ejercicio 14")
        println("0. Salir")

        print("Elige una opción: ")

        opcion = readLine()?.toIntOrNull() // Lee la entrada del usuario y la convierte a Int.

        // Estructura de control que ejecuta un bloque de código según la opción seleccionada.
        when (opcion) {
            1 -> {
                println("Ejecutando el Ejercicio 1...")
                Ejercicio1()
            }

            2 -> {
                println("Ejecutando el Ejercicio 2...")
                Ejercicio2()
            }

            3 -> {
                println("Ejecutando el Ejercicio 3...")
                Ejercicio3()
            }

            4 -> {
                println("Ejecutando el Ejercicio 4...")
                Ejercicio4()
            }

            5 -> {
                println("Ejecutando el Ejercicio 5...")
                Ejercicio5()
            }

            6 -> {
                println("Ejecutando el Ejercicio 6...")
                Ejercicio6()
            }

            7 -> {
                println("Ejecutando el Ejercicio 7...")
                Ejercicio7()
            }

            8 -> {
                println("Ejecutando el Ejercicio 8...")
                Ejercicio8()
            }

            9 -> {
                println("Ejecutando el Ejercicio 9...")
                Ejercicio9()
            }

            10 -> {
                println("Ejecutando el Ejercicio 10...")
                Ejercicio10()
            }

            11 -> {
                println("Ejecutando el Ejercicio 11...")
                Ejercicio11()
            }

            12 -> {
                println("Ejecutando el Ejercicio 12...")
                Ejercicio12()
            }

            13 -> {
                println("Ejecutando el Ejercicio 13...")
                Ejercicio13()
            }

            14 -> {
                println("Ejecutando el Ejercicio 14...")
                Ejercicio14()
            }

            0 -> println("Saliendo")
            else -> println("Elige una opción válida")
        }
    }
}

fun Ejercicio1() {
    println("Introduce tu nombre:")
    val nombre =
        readLine().orEmpty() // Lee la entrada del usuario y la almacena en la variable nombre, si es nulo, la convierte en una cadena vacía.
    println("Hola, $nombre")
}

fun Ejercicio2() {
    println("Introduce un número:")
    val numero = readLine()?.toIntOrNull() ?: 0 // Convierte la entrada en un entero, si es nulo o inválido, asigna 0.
    // Verifica si el número es par o impar usando el operador módulo (%) y lo imprime.
    println(if (numero % 2 == 0) "$numero es par" else "$numero es impar")
}

fun Ejercicio3() {
    println("Introduce el radio:")
    val radio =
        readLine()?.toDoubleOrNull() ?: 0.0 // Lee y convierte la entrada a double, si es nulo o inválido, asigna 0.0.
    val area = PI * radio * radio // Calcula el área del círculo usando la fórmula de cálculo de área.
    println("El área del círculo es: $area")
}

fun Ejercicio4() {
    val numeroAleatorio = (1..100).random()
    var adivinanza: Int
    do {
        println("Adivina un número entre 1 y 100:")
        adivinanza = readLine()?.toIntOrNull()
            ?: 0 // Lee la entrada del usuario y la convierte en un entero, si es inválido, asigna 0.
        if (adivinanza < numeroAleatorio) println("El número es mayor")
        if (adivinanza > numeroAleatorio) println("El número es menor")
    } while (adivinanza != numeroAleatorio)
    println("¡Has acertado! máquina, crack, titán, arquitecto, astronauta")
}

fun Ejercicio5() {
    println("Introduce un número:")
    val numero =
        readLine()?.toIntOrNull() ?: 1 // Lee y convierte la entrada a un entero, si es nulo o inválido, asigna 1.
    // Imprime la tabla de multiplicar del número indicado.
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

fun Ejercicio6() {
    val suma = (1..100).sum()
    println("La suma de los números es: $suma")
}

fun Ejercicio7() {
    println("Introduce una cadena:")
    val cadena = readLine().orEmpty() // Lee la entrada como cadena, si es nulo, asigna una cadena vacía.
    // Imprime la cadena invertida usando la función reversed().
    println("Tu cadena al revés es: ${cadena.reversed()}")
}

fun Ejercicio8() {
    println("Introduce una frase:")
    val frase = readLine().orEmpty() // Lee la entrada del usuario como una cadena.
    // Cuenta cuántas vocales hay en la frase usando count() y lowercaseChar() para ignorar mayúsculas.
    val vocales = frase.count { it.lowercaseChar() in "aeiou" }
    println("La frase contiene $vocales vocales.")
}

fun Ejercicio9() {
    println("Introduce un número:")
    val numero = readLine()?.toIntOrNull() ?: 0 // Lee y convierte la entrada a entero. Si es nulo o inválido, asigna 0.
    // Verifica si el número es primo comprobando que no tenga divisores entre 2 y el número - 1.
    val esPrimo = (2 until numero).none { numero % it == 0 }
    println(if (esPrimo) "$numero es primo" else "$numero no es primo")
}

fun Ejercicio10() {
    println("Introduce la temperatura en grados Celsius:")
    val celsius =
        readLine()?.toDoubleOrNull() ?: 0.0 // Lee y convierte la entrada a double. Si es nulo o inválido, asigna 0.0.
    // Convierte de Celsius a Fahrenheit usando la fórmula F = C * 9/5 + 32.
    val fahrenheit = celsius * 9 / 5 + 32
    println("$celsius°C son $fahrenheit°F")
}

fun Ejercicio11() {
    println("¿Cuántos números quieres de la cadena Fibonacci?")
    val n = readLine()?.toIntOrNull() ?: 0 // Lee y convierte la entrada a entero, si es nulo o inválido, asigna 0.
    var a = 0
    var b = 1
    repeat(n) {
        println(a)
        val temp = a
        a = b
        b += temp
    }
}

fun Ejercicio12() {
    println("Introduce un número entero:")
    val numero = readLine()?.toIntOrNull() ?: 0 // Lee y convierte la entrada a entero, si es nulo o inválido, asigna 0.
    println("El número invertido es: ${numero.toString().reversed()}")
}

fun Ejercicio13() {
    val nombre = readLine().orEmpty()
    println("Introduce la cantidad de episodios:")
    val episodios = readLine()?.toIntOrNull() ?: 0
    println("Introduce el género:")
    val genero = readLine().orEmpty()
    println("Anime: $nombre, Episodios: $episodios, Género: $genero")
}

fun Ejercicio14() {
    // Define un inventario como una lista mutable de videojuegos.
    val inventario = mutableListOf<String>()
    var opcion: Int?
    do {
        println("1. Añadir videojuego")
        println("2. Eliminar videojuego")
        println("3. Mostrar inventario")
        println("0. Salir")
        opcion = readLine()?.toIntOrNull()
        when (opcion) {
            //Añadir un videojuego al inventario
            1 -> {
                println("Introduce el título del videojuego:")
                val titulo = readLine().orEmpty()
                inventario.add(titulo)
                println("Videojuego $titulo añadido.")
            }

            //Eliminar un videojuego del inventario
            2 -> {
                println("Introduce el título del videojuego:")
                val titulo = readLine().orEmpty()
                if (inventario.remove(titulo)) {
                    println("Videojuego $titulo eliminado.")
                } else {
                    println("No se encontró el videojuego $titulo.")
                }
            }
            //Imprimir el inventario por consola
            3 -> {
                println("Inventario:")
                inventario.forEach { println(it) }
            }

            //Saliendo del inventario
            0 -> println("Saliendo del inventario")
            else -> println("Elige una opción válida")
        }
    } while (opcion != 0)
}