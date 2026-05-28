fun main(){
    var n = 10
    var fact: Long = 1
    for(i in 1..n){
        fact *= i
    }
    println("The factorial is : $fact")
}
