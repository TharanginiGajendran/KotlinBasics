package Collection.TransfromationOperation

import java.security.Key

/**
 * Flatten => flatten is used to convert nested collection into single collection
 */


fun main(){
    flatten()
    setFlatten()
    mapFlatten()
    threeDimensionalarray()
}

fun flatten(){
    val nestedList = listOf(
        listOf(1,2,3),
        listOf("one","two","three","four"),
        listOf(4,5,6)
    )

    val flattenToSingle = nestedList.flatten()
    println(flattenToSingle)

}

fun setFlatten(){
    val nestedSet = setOf(
        setOf(1,2,3,4),
        setOf(1,2,3,"Three")
    )

    val setFlat = nestedSet.flatten()
    println(setFlat)
}

fun mapFlatten() {
    val numberMap = mapOf(
        "even" to listOf(2, 4, 6),
        "odd" to listOf(1, 3, 5),
        "prime" to listOf(2, 3, 5, 7)
    )

    println(numberMap)
// Using flatMap to flatten and transform the nested collections in the map
    val flattenedAndDoubled = numberMap.flatMap { (key, value) ->
        value.map { number -> "$key: ${number * 2}" }
    }
    println(flattenedAndDoubled)
}

fun threeDimensionalarray(){
    val threeArray = arrayOf(
        arrayOf(arrayOf(1,2,3,4,5,6)),
        arrayOf(arrayOf(10,2,3,4,))
    )
    println(threeArray[0][0][0])
    println(threeArray[1][0][0])


}
