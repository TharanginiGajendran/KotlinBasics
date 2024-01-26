package Loops

fun main(){
    var numbers = listOf(1,332,3,4,5,6,7,8)

    var max = 0
    for (i in numbers){
        if (i > max){
            max = i
        }
    }
    println(max)

}
