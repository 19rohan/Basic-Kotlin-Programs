fun sum(n: Int): Int{
    var sum = 0
    for (i in 1..n){
        sum+=i
    }
    return sum
}
fun main(){
    var result = sum(5)
    println("sum from 1 to 5: $result")
}
