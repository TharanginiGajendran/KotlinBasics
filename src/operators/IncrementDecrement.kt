package operators

fun main() {
    var x = 1
    var y = 3

    //prints value first and then increment or decrement
    println("Increment: ${x++}")  //2
    println("Decrement: ${y--}") //2

   //decrement or increment value first and then prints
    println("Increment1: ${++x}") //3
    println("Decrement1: ${--y}") //1
}