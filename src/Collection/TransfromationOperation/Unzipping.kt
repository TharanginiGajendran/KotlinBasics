package Collection.TransfromationOperation

/**
 * unzipping can be used to separate combined list into two separate list
 * it can also be used in key value pair separation
 * if the key value pair is of map => you cannot unzip it convert it into list
 *
 * works only with set and list
 */

fun main(){
    unZipping()
    unzipConvertedMap()
}
fun unZipping(){
    val mapKeyValue = listOf("Thara" to 1,"Vijay" to 2,"Sanjay" to 3)
    val unzip = mapKeyValue.unzip()
    println(unzip)
    println(mapKeyValue)

    val list1 = listOf("apple","orange","banana","strawberry")
    val list2 = listOf(1,2,3,4,5,6)
    val combinedList = list2.zip(list1)
    println(combinedList)

    val unzipList = combinedList.unzip()
    println(unzipList)

}
fun unzipConvertedMap(){
    val mapKeyValue = mapOf("Thara" to 1,"Vijay" to 2,"Sanjay" to 3)
    val converToList = mapKeyValue.toList()
    println(converToList)
    val unzipNow = converToList.unzip()
    println(unzipNow)

}