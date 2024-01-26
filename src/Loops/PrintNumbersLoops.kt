package Loops

fun main(){

//    rangeLoops()
//    keywordUntil()
//    keywordDownTo()
    keywordStepUntil()
}
fun rangeLoops(){
    var number = 1..10
    for (i in number){
        println(i)
    }
}
fun keywordUntil(){
    for (j in 1 until 20){
        println(j)
    }
}
fun keywordDownTo(){
    for (k in 20 downTo 2){
        println(k)
    }
}
fun keywordStepUntil(){
    for(i in 1 until 10 step 2){
        println(i)
    }
}