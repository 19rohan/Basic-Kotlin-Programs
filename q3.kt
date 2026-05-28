fun sumnum(): Int{
    var sum = 0
    for (i in 1..10){
        sum+=i
    }
    return sum
}
fun main(){
    var result:Int = sumnum()
    println(result)
}
