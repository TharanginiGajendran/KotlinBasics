package Collection.Set


fun main() {
    unionSet()
    intersectSet()
    differenceSet()
}

fun unionSet(){
    /**
     * union -> includes all the elements from set1 and set2
     * takes uncommon elements from both
     */
    val set1 = setOf(1,2,3,4,5)
    val set2 = setOf(6,7,8,9,10)
    val unionSet = set1.union(set2)
    println(unionSet)
}

fun intersectSet(){
    /**
     * intersection -> takes common elements from the both
     */
    val set1 = setOf(1,2,3,4,5)
    val set2 = setOf(1,2,8,9,10)
    val intersectSet = set1.intersect(set2)
    println(intersectSet)
}

fun differenceSet(){
    /**
     * Only takes the elements that are uniquely present in the set1
     */
    val set1 = setOf(1,2,3,4,22)
    val set2 = setOf(2,4,6,8)
    val diffSet = set1.subtract(set2)
    println(diffSet)
}

