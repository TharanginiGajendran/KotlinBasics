package statementsandloops

fun main(){

    ifAnd()
    ifOr()
}

fun ifAnd(){
    val a = 100
    if (a < 10 && a == 100){
        println("Both should be correct")
    }
}
fun ifOr(){
    val b = 20
    if (b > 10 || b < 10){
        println("One can be correct")
    }
}
