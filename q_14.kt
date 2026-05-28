fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    var i = 2
    while (i * i <= num) {
        if (num % i == 0) return false
        i++
    }
    return true
}
fun main() {
    val n = 30
    print("Prime numbers up to $n: ")
    for (i in 1..n) {
        if (isPrime(i)) print("$i ")
    }
}
