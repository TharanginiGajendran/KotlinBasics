package Collection.TransfromationOperation

/**
 * filtering is used to filter which select or excludes elements based on the given condition
 */

fun main(){

    filteringExample()
    filterNotExample()
    removeIfForFilter()
    filterMap()
}

fun filteringExample(){
    val list1 = listOf(1,2,3,4,5,6,7,8,9,10)
    val filterList = list1.filter { it % 2==0 }
    println(filterList)
}

fun filterNotExample(){
    val set1 = setOf(1,2,3,4,5,6,7,8,9,10)
    val filterNotSet = set1.filterNot { it % 2 == 0 }
    println(filterNotSet)
}

fun removeIfForFilter(){
    //remove if modify the original list
    val list1 = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    val removeIf = list1.removeIf {
        it > 5
    }
    println(removeIf)
    println(list1)
}

fun filterMap(){
    val numMap = mapOf("Thara" to 1,"Vijay" to 2)
    val filterMap = numMap.filter { it.value == 2 }
    println(filterMap)
}