package OOPS

/**
 * with companion object you can call a function, variable without declaring
 * an object for the class it contains and can directly access it using class itself
 * Those variables or class that is declared inside a class is called
 * class variable and class function
 *
 */
fun main(){
//    without companion object
//    val calculator = Calculator()
//    val result = calculator.sum(2,4)
//    println(result)
    val compCal = Calculator.sum(23,23)
    println(compCal)


    val max = Int.MAX_VALUE  //this is also a companion object
    println(max)
}
class Calculator(){
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }

}