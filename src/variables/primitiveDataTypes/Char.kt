package variables.primitiveDataTypes

fun main(){
    val char: Char = 'T'
    println(char)

    val listChar = charArrayOf('T','H','A')
    println(listChar)

    charLiterals()
    charRange()
    charConversion()
}
fun charLiterals(){
    val newlineChar: Char = '\n'
    val tabChar: Char = '\t'
    val singleQuote: Char = '\''
    val backslash: Char = '\\'
    println(newlineChar)
    println(tabChar)
    println(singleQuote)
    println(backslash)

}

fun charRange(){
    var charRange = 'A'..'Z'
    println(charRange)

    for (char in charRange){
        println(char)
    }
}

fun charConversion(){
    println("\n")
    var letter = 'A'
    var charToString = letter.toString()
    println(charToString)

    var charAscii = letter.toInt()
    println(charAscii)

}
