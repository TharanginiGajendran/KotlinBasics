package Collection.Map

/**
 * ordered collection of key value pair
 * access values based on key
 */
fun main(){
    linkedHashMap()
}
fun linkedHashMap(){
    val linkedMap = linkedMapOf(1 to "Thara",2 to "Tom",3 to "Vijay")
    println(linkedMap)

    linkedMap[1] = "Tharangini"
    println(linkedMap)
}