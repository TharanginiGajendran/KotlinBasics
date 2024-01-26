package Arrays

fun main(){

    /**
     * Arrays -> array allows us to store more than one element in a variable
     * arrays can be accessed using index
     * can have duplicates
     */

    val names: Array<String> = arrayOf("Thara","Vijay","vikram","Vinay","Tom","Hanks","cruise")
    println(names[0])
    println(names[2])
    println(names.size)

    for (name in names){
        println(name)
    }

    /**
     * using for each for displaying array
     */
    names.forEach { println(it) }
}