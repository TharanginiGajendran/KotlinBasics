package OOPS

/**
 * To create a object we need template or blueprint
 * class is a blueprint to create a object
 *
 * object has state and functionality => one entity
 * state is also called as properties
 * so we createvariables for state
 */

fun main(){
    var car1 = Car()
    car1.move()
    car1.stop()
    println(car1.carColor)
    println(car1.wheels)
    println(car1.doors)

//    this is called creating the instance of the class or object of the class
    var car2 = Car()
    car2.stop()
    car2.move()

}
class Car{
    var carName = "Skoda"
    var carColor= "Blue"
    var wheels = 4
    var doors = 4

    fun move(){
        println("The car $carName is moving")
    }

    fun stop(){
        println("The car $carName is stopped")
    }
}
