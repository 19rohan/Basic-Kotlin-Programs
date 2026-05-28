fun cToF(c: Double): Double = (c * 9 / 5) + 32
fun Ftoc(f: Double): Double = (f - 32) * 5 / 9
fun main() {
    val c = 37.0
    val f = 98.6
    println("$c°C to Fahrenheit: ${ cToF(c)}°F")
    println("$f°F to Celsius: ${ Ftoc(f)}°C")
}
