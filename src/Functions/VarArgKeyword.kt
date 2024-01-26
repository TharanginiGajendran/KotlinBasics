package Functions

import java.io.StringReader

fun main(){
    println( varargKey(4,4,4))
    varargString("Thara","Tom","Hanks","Cruise")
}
/**
 * vararg keyword used, when we want more than one parameter
 */
fun varargKey(vararg numbers: Int) : Int{
   var result = 0
    for (i in numbers){
        result += i
    }
    return result
}

fun varargString(vararg names: String){
    for (i in names){
        println(i)
    }
}