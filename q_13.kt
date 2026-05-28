fun SI(p: Double, r: Double, t: Double): Double {
    return (p * r * t) / 100
}
fun main() {
    val interest = SI(1000.0, 5.0, 2.0)
    println("Simple Interest: $interest")
}
