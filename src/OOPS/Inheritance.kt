package OOPS

/**
 * Inheritance => with which you create a class using another, it has parent class and child class
 * child class inherits its functions and properties from parent class and also
 * child class can also have the functions and properties of its own
 * Iheritance class is declared using open keyword in kotlin
 *
 *
 * The functions inside should also have open keyword so that it can be inherited
 */

fun main(){
    val childClassObjectDog = Dog("Dommy")
    println(childClassObjectDog.name)
    println(childClassObjectDog.color)
    println(childClassObjectDog.species)

    val cat = Cat("Sleems","Orange")
    println(cat.name)
    println(cat.color)
    println(cat.species)

}
open class Animal(var name: String,var color: String, var species: String){

}

class Dog(name: String): Animal(name,"Brown","Dog SPecies"){

}
class Cat(name: String,color:String): Animal(name,color,"Cat Species"){}