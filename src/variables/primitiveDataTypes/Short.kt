package variables.primitiveDataTypes

fun main(){
    val shortValue: Short = 327
    println(shortValue)

    minAndMaxShort()
}

fun minAndMaxShort(){
    val min = Short.MIN_VALUE
    val max = Short.MAX_VALUE
    println("min is $min")
    println("max is $max")
}