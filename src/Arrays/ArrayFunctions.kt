package Arrays

fun main(){

    exampleOfVararg(1,3,45,55,67)

    filterArray()
    anyArray()
    mapArray()
    allArray()
    countArray()
    findArray()
    sortedArray()
    minOrMaxNullArray()
    distinctArray()
    forEachIndexedArray()
}
fun filterArray(){
    /**
     * filter the desired condition result in a list
     */
    val number: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    val evenNumbers = number.filter { it % 2 == 0}
    println("filter- $evenNumbers")
}

fun anyArray(){
    /**
     * if one condition satisfies returns true
     * returns true or false
     */
    val anyNum: Array<Int> = arrayOf(1,2,3,5,7)
    val result = anyNum.any { it% 2 == 0 }
    println("any - $result")
}

fun mapArray(){
    /**
     * maps the value given to the array or list
     */
    val map: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    val mapResult = map.map { it * 2}
    println("map -- $mapResult")
}

fun allArray(){
    /**
     * should satisfies all the conditon returns true
     * returns true or false
     */
    val allNum : Array<Int> = arrayOf(2,3,4,5,6,7,8,9)
    val allResult = allNum.all { it > 1  }
    println("all - $allResult")
}

fun countArray(){
    /**
     * counts the number of given condition
     */
    val countNum: Array<Int> = arrayOf(1,2,3,4,5,6,7,7)
    val countResult = countNum.count { it > 2 }
    println("count -$countResult")
}

fun findArray(){
    /**
     * return sthe first element which satisfies the given condition
     */
    val finNum: Array<Int> = arrayOf(1,4,3,4,5,6,7,8)
    val finResult = finNum.find { it % 2 == 0 }
    println("Find - $finResult")
}
fun sortedArray(){
    /**
     * sorts the numbers in ascending order
     */
    val sortNUm = arrayOf(1,6,7,8,3,4,2)
    val sortResult = sortNUm.sorted()
    println("sort - $sortResult")
//
//    val result = sortNUm.sortedBy { it % 2 == 0 }
//    println("sortedby-$result")
}
fun minOrMaxNullArray(){
    /**
     * returns min or max value in the array
     */
    val minorMaxNum = arrayOf(1,2,3,4,54)
    val minResult = minorMaxNum.minOrNull()
    println("minResult-$minResult")
    val maxResult = minorMaxNum.maxOrNull()
    println("maxResult - $maxResult")
}
fun distinctArray(){
    /**
     * removes duplicates
     */
    val disNum = arrayOf(1,2,3,4,5,6,7,7,7,8)
    val disResult = disNum.distinct()
    println("distinct -$disResult")
}
fun forEachIndexedArray(){
    /**
     * prints index and values of each element in the array
     */
    val forNum = arrayOf(1,2,3,4,5,6,7,8,9)
    forNum.forEachIndexed { index, value -> println("Index $index: $value") }

}

fun exampleOfVararg(vararg numbers: Int) {
    var num = 0
    for (i in numbers){
        println(i)
    }

}