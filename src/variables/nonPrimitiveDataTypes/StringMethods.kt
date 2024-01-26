package variables.nonPrimitiveDataTypes

fun main(){
    println("*******find length of the variable******")
    val name = "Tharangini"
    val length = name.length
    println("The length of the variable is ${length}")

    concatenation()
    multiLineString()
    substring()
    rawString()
    escapeString()
    stringConstructor()
    otherMethods()

}
fun concatenation(){
    var firstName = "Tharangini"
    var lastName = "Gajendran"
    var concatenate1 = firstName +" "+ lastName
    println(concatenate1)
    var concatenate2 =  firstName.plus(lastName)
    println(concatenate2)
}

fun multiLineString(){
    val emailMessage = """
        Hi, Tharangini
        I hope this message finds you well
        You are Selected
    """.trimIndent()
    println("MultiLineString: $emailMessage")
}

fun substring(){
    val animal = "Dinasour"
    val substring = animal.substring(0, 4) // Extracts characters from index 0 to 4
    println(substring)
}
fun rawString(){
    val regexPattern = """\d{3}-\d{2}-\d{4}"""
    println(regexPattern)
}
fun escapeString(){
    val twoLines = "Hello\nWorld"
    println(twoLines)
}
fun stringConstructor(){
    val stringConstruct = String(charArrayOf('T','H','A','R','A'))
    println(stringConstruct)
}
fun otherMethods(){
    var myName = "Tharangini"
    val upper = myName.uppercase()
    val lower = myName.lowercase()
    val contain = myName.contains("ara")  //prints true or false
    val last = myName.last()
    val first = myName.first()
    println(upper)
    println(lower)
    println(contain)
    println(last)
    println(first)
}