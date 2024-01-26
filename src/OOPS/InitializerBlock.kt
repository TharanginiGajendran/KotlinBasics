package OOPS

/**
 * Initializers block are first to be executed when you create a instance of class
 * Initializers blocks are used in conjunction with primary constructors
 * you can have as many init blocks you want
 */

fun main(){

    var cars = Cars("lambhorgini","560",5)
    cars.start()
    println("Test 3")

}
class Cars(var name: String, val model: String, val doors: Int){
    init {
        println("Test 1")
//        lets take scenario for race car
        if (name == "Lambhorgini"){
            println("Not this car $name for racing")
        }
        else{
            println("This is the car i want $name for racing")
        }
//        println("The name of the car is $name and model is $model and has $doors doors")
    }

    init {
        if (name.lowercase().startsWith('l')){
            this.name = name
        }
        else{
            this.name = "No Cars"
            println("No car starts with l")
        }

    }

    fun start(){
        println("The car is started for race $name")
        println("Test 2")
    }
}