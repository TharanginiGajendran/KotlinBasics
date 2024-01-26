package Collection.Set


/**
 * hash set is immutable, you can adda or remove elements
 */
fun main(){

    //unoredered collection of unique elements
    val hashSet: HashSet<String> = HashSet()
    hashSet.add("Tharangini")
    println(hashSet)
    hashSet.addAll(arrayOf("Tharangini","Gajendran"))
    println(hashSet)
    hashSet.add("Tom")
    println(hashSet)
    hashSet.remove("Tharangini")
    println(hashSet)

//    oredered collection of unique elements
    val linked: LinkedHashSet<Int> = LinkedHashSet()
    linked.add(1)
    println(linked)
    linked.addAll(linkedSetOf(1,2,3,4,4))
    println(linked)
    linked.remove(3)
    println(linked)

}