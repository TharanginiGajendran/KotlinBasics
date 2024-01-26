package Collection.Map


/**
 * immutable map cannot be accessed or we can change its value
 * it is read only
 */
fun main(){
    ImmutableMap()
}

fun ImmutableMap(){

    val immute = mapOf(1 to "Thara",2 to "Tom",3 to "Hanks")
    println(immute)
    val convertMute = immute.toMutableMap()
    convertMute[1] = "Tharangini"
    println(convertMute)
}