package statementsandloops

fun main() {
//    elvis operator => ?:

    /**
     * elvis operator => ?:
     * we use elvis with null, when the text is null
     * we assign value to it
     */
    var word: String? = null
    word = "the variable is not null"
    /**
     * basically saying if word is null, assign elvis values
     * if not assign value with original string
     */
    var letter = word ?: "Tharangini"
    println(letter)
}