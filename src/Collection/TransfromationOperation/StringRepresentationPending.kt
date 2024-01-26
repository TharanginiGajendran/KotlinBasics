package Collection.TransfromationOperation


fun main() {
    stringLiterals()
    rawString()
    stringTemplate()
    stringConcatenation()
    stringFunction()
    stringInterpolation()
    stringJoinToString()
}

fun stringLiterals() {
    val stringHello: String = "Hello World"
    println(stringHello)
}

fun rawString() {
    val welcome = """
        Hi, Tharangini Gajendran,
        Welocme to kotlin course
        Nice to have you here
    """.trimIndent()
    println(welcome)
}
fun stringTemplate(){
    val name = "Tharangini"
    val greeting = "Welcome $name"
    println(greeting)
}

fun stringConcatenation(){
    val firstName = "Tharangini"
    val lastName = "Gajendran"

    val concatenate = firstName + " "+ lastName
    println(concatenate)
}
fun stringFunction(){
    val message = "Welcome to Kotlin"

    val length = message.length
    println(length)

    val substring = message.substring(0, 6)
    println(substring)

    val upper = message.uppercase()
    println(upper)
    val lower = message.lowercase()
    println(lower)

}

fun stringInterpolation(){
    val builder = StringBuilder()
    builder.append("Tharangini")
    builder.append("Gajendran")
    val result = builder.toString()
    println(result)
}

fun stringJoinToString(){
    val list1 = listOf("Thara","Vijay","Vikram","vinay")
    val join = list1.joinToString("-")
    println("join: $join")

}