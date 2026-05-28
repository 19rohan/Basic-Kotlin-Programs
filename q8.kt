fun main(){
    var n = 1892
    var count = 0
    if(n == 0) count = 1

    while (n != 0){
        n /= 10
        count++
    }
    println("count: $count")
}
