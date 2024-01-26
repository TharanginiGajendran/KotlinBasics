package variables.primitiveDataTypes

fun main(){
    val doubleValue: Double = 2.4
    println(doubleValue)

    minAndMaxDouble()
}

fun minAndMaxDouble(){
    val min = Double.MIN_VALUE
    val max = Double.MAX_VALUE
    println("min is $min")
    println("max is $max")
}