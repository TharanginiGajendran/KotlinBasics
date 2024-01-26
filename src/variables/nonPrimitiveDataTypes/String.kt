package variables.nonPrimitiveDataTypes

fun main() {

//    string is a class
    println("*****using var => mutable*******")
    var name = "Tharangini"
    println("Before variable change: ${name}")

    name = "Tharangini Gajendran"
    println("After variable change: ${name}")
    println("*********End var***********")


    println("\n")
    println("*******using val => immutable******")
    val firstName = "Thara"
    println(firstName)

//    cannot change variable declared using val
//    firstName = "Tharangini"

}