package Arrays

fun main(){
    val number: Array<Int> = arrayOf(1,2,3,3,4,5,6,6,6)
    number.forEach { println(it) }
    println(number[2])
    println(number[3])
}