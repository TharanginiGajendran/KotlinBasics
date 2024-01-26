package Collection.List

fun main() {
    mapList()
    filterList()
}

fun mapList() {
    var mapList = listOf(1, 2, 3, "Thara", "Tom", "Hanks", false)
    var mapThis = mapList.map { it }
    println(mapThis)

    var numMap = mutableListOf(1,2,3,4,5)
    var letterMap = mutableListOf("Thara")

    var mappingBoth = numMap.map { letterMap }
    println(mappingBoth)
}

fun filterList(){
    var filterList = listOf("Thara","Tom","Hanks","Cruise")

    val filter = filterList.filter { filterList ->
        if (filterList.contains("T")){
            true
        }
        else{
            false
        }
    }
    println(filter)
}