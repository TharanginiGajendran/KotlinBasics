package Collection.List

/**
 * cannot modify immutable list
 * its a read only view
 */
fun main(){
    immutableList()
    convertImutableToMutable()
}

fun immutableList(){
    var myList = listOf(1,2,3,4,"Thara","Tom")
    println(myList)
}

fun convertImutableToMutable(){
    var immute = listOf(1,2,3,4,"Thara","Tom","Hanks")
    println(immute)
    var mute = immute.toMutableList()
    mute[0] = 34
    mute[4] = "tharangini"
    println(mute)
}