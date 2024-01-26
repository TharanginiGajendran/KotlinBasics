package variables.primitiveDataTypes

fun main() {
    intVar()
    intVal()
    minAndMaxValue()

}
fun intVar() {
    var number = 30
    println(number)

    number = 40
    println(number)
}

fun intVal() {
    val firstNumber = 3
    println(firstNumber)

//    firstNumber = 6
}
fun minAndMaxValue(){
    val intMin = Int.MIN_VALUE
    val intMax = Int.MAX_VALUE
    println("min value is $intMin")
    println("max value is $intMax")
}