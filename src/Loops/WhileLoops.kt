package Loops

fun main(){
    var number = 0

    while (number < 10){
        println(number)
        number ++
    }

    var firstName: String? = null
//   println(firstName)

    var name = firstName ?: "Tharangini Gajendran"
    println(name)


}