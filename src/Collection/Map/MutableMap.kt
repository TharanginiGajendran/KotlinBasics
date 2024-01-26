package Collection.Map

import com.sun.jdi.Value
import java.security.Key

/**
 * map is a collection of key value pairs and it is used for storing and
 * retrieving elements based on keys
 *
 * keys exactly stores one value
 *
 * can add or remove elements
 *
 *can create key value pairs with list and set of
 */

fun main(){
    mutableMap()
}

fun mutableMap(){
    val mutableMapTest: MutableMap<Int,String> = mutableMapOf(1 to "Raju",2 to "Vijay", 3 to "Vikram")
    println(mutableMapTest)

//    add new elements =>
    mutableMapTest[5] = "Tom"
    println(mutableMapTest)
    mutableMapTest.remove(1)
//    change the element
    mutableMapTest[1] = "Vishal"
    println(mutableMapTest)


}