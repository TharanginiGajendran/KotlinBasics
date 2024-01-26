package Functions

fun main(){

    forEach(  5,5,5,5)
}

fun forEach(vararg num: Int){
    var sum = 0
    num.forEach {
        sum = sum + it
    }
    println(sum)
}