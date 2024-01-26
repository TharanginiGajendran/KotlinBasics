package Collection.List

/**
 * list is an ordered collection of elements and it can be accessed by their index
 *
 */

fun main(){
    list()
}

fun list(){
    var list = mutableListOf(1,2,3,4,5,6,7,11,1,1,1,1)
    println(list)

    list.forEach {
        println(it)
    }
}