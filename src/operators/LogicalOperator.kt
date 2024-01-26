package operators

fun main(){
    val a = 1
    val b = 6

//    And operator => both condition should be true else false
    if (a > 0 && b >= 0) println("Its wrong") else  println("Its right")
    if (a == 0 || b >= 0) println("Any one,Im right") else println("Not both,Im wrong")
    if (a != b) println("Im not equal") else println("Im equal")
}