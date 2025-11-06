// Programa funcional en Scala
// Autor: Angel Guerrero
// Ejemplo de pasar una función como parámetro (versión moderna con scala-cli)

def aplicarOperacion(x: Int, y: Int, operacion: (Int, Int) => Int): Int =
  operacion(x, y)

def sumar(a: Int, b: Int): Int = a + b
def multiplicar(a: Int, b: Int): Int = a * b

@main def main(): Unit =
  val resultado1 = aplicarOperacion(4, 2, sumar)
  val resultado2 = aplicarOperacion(4, 2, multiplicar)

  println(s"Suma: $resultado1")
  println(s"Multiplicación: $resultado2")
