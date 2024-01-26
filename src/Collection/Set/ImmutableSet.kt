package Collection.Set


fun main(){

    immutableSet()
}

fun immutableSet(){
    var immuteSet = setOf(1,2,3,4,5)
    println(immuteSet)

    var converToMutableSet = immuteSet.toMutableSet()
    println(converToMutableSet.add(42))
    println(converToMutableSet.remove(5))
    println(converToMutableSet)



}