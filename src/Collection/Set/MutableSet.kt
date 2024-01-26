package Collection.Set

/**
 * same like mutable set can add or remove elements
 * can be accessed using index
 * duplicates are not allowed
 *
 */

fun main() {
    mutableSet()
    arrayTest()
}

fun mutableSet() {
    var setMutable = mutableSetOf(1, 2, 3, 5, "Thara", "one", "two", "three", true, 1, 2)
    println(setMutable)

    setMutable.add("New set")
    setMutable.remove(10000)
    //if u try to remove elements of duplicate will removw all same element
    setMutable.remove(1)
    println(setMutable)

    var linkSet = setOf("New 1", "New 2", "New 3")
    setMutable.addAll(linkSet)
    println(setMutable)

}

fun arrayTest() {
//    arrays duplicates ae allowed
    var arrayexample = arrayOf(1, 2, 3, 4, 1, 1, 1, 1, 1)
    arrayexample.forEach { println(it) }
//    println(arrayexample)
}