package statementsandloops

fun main(){
    var number = 150

    if (number < 100 && number > 10){
        println("And im both right")
    }
    else if (number < 100 || number <  10){
        println("Or im one right")
    }
    else{
        println("Maybe im not And Or")
    }
}