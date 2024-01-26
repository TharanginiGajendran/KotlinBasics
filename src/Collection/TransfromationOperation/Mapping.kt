package Collection.TransfromationOperation


fun main() {
    mapTransformation()
    complexMapping()
    mapUsingMap()
    mapIndex()
}

fun mapTransformation() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val squaredNumbers = numbers.map {
        it * 2
    }
    println(numbers)
    println(squaredNumbers)
}

fun complexMapping(){

    val listOfPerson = listOf(
        PersonDetails("Tharangini","25"),
        PersonDetails("Vivek","20"),
        PersonDetails("Vijay","40")

    )

    val mapTryNames = listOfPerson.map { it.name }
    println("Names: $mapTryNames")

    val age = listOfPerson.map { it.age }
    println("Age: $age")
}
data class PersonDetails(val name: String, val age: String){

 }

fun mapUsingMap(){
    val createMap = mutableMapOf("Thara" to 1,"Vijay" to 2,"Vivek" to 3)
    val mappingInMapCollectionKey = createMap.map { it.key }
    println(mappingInMapCollectionKey)

    val mapCollectionValue = createMap.map { it.value }
    val valueMap = createMap.mapValues { it.value }
    println("valueMap: $valueMap")
    println(mapCollectionValue)
}

fun mapIndex(){
    val numbers = listOf(1,2,3,5,7)

    val mapIndex = numbers.mapIndexedNotNull { index, value ->
        if (index == 0){
            null
        }
        else{
            index+value
        }
    }
    println("map Index: $mapIndex")
}