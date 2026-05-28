fun largest(a: Int, b: Int, c: Int): Int {
    return if(a>= b && a>=c) a else if(b>=a && b>=c) b else c
}
fun main(){
    var a = 32
    var b = 54
    var c = 2
    var result = largest(a, b, c)
    println(result)
}
