fun main() {
    var a = 10
    var b = 20
    println("Before Swap: a = $a, b = $b")
    a = a + b 
    b = a - b 
    a = a - b
    println("After Swap: a = $a, b = $b")
}
