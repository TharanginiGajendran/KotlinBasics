package Loops

import kotlin.math.cbrt

fun main() {
//    var number = 0
//    while (number < 10) {
//        number++
//        if (number == 6) {
//            break
//        }
//        println(number)
//    }
    continueForLoop()
    breakForLoop()

}
fun continueForLoop(){
    for(i in 1..10){
        if (i in 3..7){
            continue
        }
        println(i)
    }
}
fun breakForLoop(){
    for (i in 1..10){
        if (i == 7){
            break
        }
        println(i)
    }
}