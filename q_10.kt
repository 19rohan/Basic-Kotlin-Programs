fun VoworCons(ch: Char){
    when (ch.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> println("$ch is Vowel")
        in 'a'..'z' -> println("$ch is Consonant")
        else -> println("$ch is not an Alphabet")
    }
}
fun main() {
    VoworCons('A')
    VoworCons('b')
    VoworCons('1')
}
