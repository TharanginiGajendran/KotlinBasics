package Collection.List


fun main(){
    RangeToList()
}

fun RangeToList(){
    var range  = 1..10
    var conRangeToList = range.toList()
    println(conRangeToList)
}