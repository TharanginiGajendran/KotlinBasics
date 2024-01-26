package statementsandloops

fun main(){

    val is_Active = true
    if (!is_Active){
        println("Im false")
    }
    else{
        println("Im true")
    }
    ifElseOr()
    ifElseAnd()
}
fun ifElseAnd(){
    val a = 100
    if (a < 10 && a == 100){
        println("Both are correct")
    }
    else{
        println("So im not correct")
    }
}
fun ifElseOr() {
    val b = 20
    if (b > 10 || b < 10) {
        println("One can be correct")
    }
    else{
        println("Maybe im not one right")
    }
}