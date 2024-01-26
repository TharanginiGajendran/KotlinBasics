package OOPS

/**
 * primary constructor
 * primary constructor is a concise way to declare a primary
 * properties of a class directly in the header
 */

fun main(){
    var car1 = CarConstruct("Tharangini","Gajendran",25)
//    println(car1)
    car1.details()

    var vehicles1 = primaryType2("Lambhorgini","pulzar")
    vehicles1.vehicle()

    var vehicles2 = primaryType2("      Mustang","Scooty")
    vehicles2.vehicle()

}
//parameter
class CarConstruct(firstName: String, lastName:String, age: Int){

    var first = firstName
    var last = lastName
    var myAge = age
    fun details(){
        println("The name is ${first} ${last} and age is ${myAge}")
    }
}

//properties
class primaryType2(var car: String,val bike:String){
//    trim() => remove spaces

//       var car = car.trim()
    fun vehicle(){
        println("The vehicles are $car and $bike")
    }
}