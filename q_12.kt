//with a third variable
fun main() {
    var a = 10
    var b = 20
    println("Before Swap: a = $a, b = $b")
    val temp = a
    a = b
    b = temp
    println("After Swap: a = $a, b = $b")
}
//without a third variable
fun main() {
    var a = 10
    var b = 20
    println("Before Swap: a = $a, b = $b")
    a = a + b
    b = a - b
    a = a - b
    println("After Swap: a = $a, b = $b")
}
