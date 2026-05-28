fun main(){
    var num: Int = 1234
    var reverse: Int = 0
    while(num != 0){
        var dig = num % 10
        reverse = reverse *10 + dig
        num /=10
    }
    println("reversed = $reverse")
}
