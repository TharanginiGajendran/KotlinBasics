package variables.primitiveDataTypes

fun main(){
    val longValue: Long = 444L
    println(longValue)

    minAndMaxLong()
}

fun minAndMaxLong(){
    val min = Long.MIN_VALUE
    val max = Long.MAX_VALUE
    println("min is $min")
    println("max is $max")
}