package statementsandloops

fun main() {
    //null is no value and no reference in memory
//    no value but assigning a value later to it
    /**
     * null pointer exception thrown at runtime
     */
    var word: String? = null
    word = "New Text"

    println(word!!.length)
//    if(word  == null) {
//        println(word?.length)
//    }
//    else{
//        println("The word is null")
//    }

}