// --------------------------------------------------------------
// Programa funcional en Scala
// Autor: Angel Guerrero
// Fecha: 5 de Noviembre de 2025
// Descripción: Ejemplo de un programa funcional que muestra cómo
//              pasar una función como parámetro en Scala.
// --------------------------------------------------------------

object Main {

  // ------------------------------------------------------------
  // Función de orden superior:
  // Recibe dos números (x, y) y una función (operacion) como parámetro.
  // La función operacion se aplica a los valores x e y.
  // ------------------------------------------------------------
  def aplicarOperacion(x: Int, y: Int, operacion: (Int, Int) => Int): Int = {
    operacion(x, y)
  }

  // ------------------------------------------------------------
  // Funciones que se pueden pasar como parámetro:
  // sumar -> devuelve la suma de dos enteros.
  // multiplicar -> devuelve el producto de dos enteros.
  // ------------------------------------------------------------
  def sumar(a: Int, b: Int): Int = a + b
  def multiplicar(a: Int, b: Int): Int = a * b

  // ------------------------------------------------------------
  // Función principal del programa:
  // Aquí se llama a "aplicarOperacion" pasando como argumento
  // las funciones "sumar" y "multiplicar".
  // ------------------------------------------------------------
  def main(args: Array[String]): Unit = {
    val resultado1 = aplicarOperacion(4, 2, sumar)
    val resultado2 = aplicarOperacion(4, 2, multiplicar)

    // ----------------------------------------------------------
    // Salida esperada:
    // Suma: 6
    // Multiplicación: 8
    // ----------------------------------------------------------
    println(s"Suma: $resultado1")
    println(s"Multiplicación: $resultado2")
  }
}

// ------------------------------------------------------------
// Información técnica
// Lenguaje: Scala
// Versión: 3.7.3
// Editor: Visual Studio Code
// Sistema operativo: macOS (Apple Silicon)
// Java (JDK): 25
// ------------------------------------------------------------
