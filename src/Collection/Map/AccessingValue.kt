package Collection.Map

/**
 * if you access key value which are not present will give you null value
 */

fun main(){
    AccesMapValue()
}
fun AccesMapValue(){
    val mapValue = mutableMapOf("Thara" to 1,"Vikram" to 2)
    val printValue = mapValue["Thara"]
    println(printValue)
}