package variables.primitiveDataTypes

fun main(){
   val floatValue: Float = 3.5f
   println(floatValue)

    minAndMaxFloat()
}

fun minAndMaxFloat(){
    val min = Float.MIN_VALUE
    val max = Float.MAX_VALUE
    println("min is $min")
    println("max is $max")
}
