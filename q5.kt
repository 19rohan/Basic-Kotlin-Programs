fun main(){
    var num = 1331
    val original = num
    var reversed = 0
    while (num!=0){
        val dig = num %10
        reversed = reversed * 10 + dig
        num /= 10
    }
    if(reversed == original){
        println("It's a palindrome ")
    }
    else{
        println("It's not a palindrome ")
    }
}
