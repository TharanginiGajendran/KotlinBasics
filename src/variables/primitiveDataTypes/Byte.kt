package variables.primitiveDataTypes

fun main(){
    val byteValue = 0
    println(byteValue)

    val value: Byte = 127
    println(value)

    minAndMaxByte()
}

fun minAndMaxByte(){
    val minByte = Byte.MIN_VALUE
    val maxByte = Byte.MAX_VALUE

    println("min byte: $minByte")
    println("max byte: $maxByte")
}