package Collection.List


/**
 * mutable list is a list which the size can be modified, can be added or removed
 * can be accessed by its index
 * can take duplicates
 *
 */
fun main() {
    mutableList()
    testMixedList()
}

fun mutableList() {
    var myList = mutableListOf("Tharangini", "Tom", "Cruise", "Hanks")
    println(myList)

    myList[0] = "Thara"
    myList.add("New name")
    myList.remove("Cruise")
//    myList.removeAll(myList)
//    myList.clear()
    myList.size
    myList.addAll(mutableListOf("Andrew", "Akshay"))
    println(myList)
}

fun testMixedList() {
    var mixedElements = mutableListOf(1, 2, 3, "Thara", "Cruise", true, 1, 2, 'D')
    println(mixedElements.distinct())
    mixedElements[0] = 20
    mixedElements.add("New element")
    println(mixedElements)
}