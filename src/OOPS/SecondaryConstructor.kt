package OOPS

/**
 * In kotlin you can have multiple constructor and those are called secondary constructor
 * constructor() => keyword for secondary constructor
 * cannot declare properties and only declare parameters
 * can have many secondary constructors we want
 */

fun main(){
//    arguments
    val person1 = Person("Tharangini")
//   arguments
    val person = Person("Tom","Cruise")
    println("${person1.firstName} ${person1.lastName} ${person1.age}")


//    println("My name is ${person.firstName} ${person.lastName} and age is ${person.age}")
    println("${person.firstName} ${person.lastName} ${person.age}")

}
//primary constructor properties
class Person(var firstName: String,var lastName: String,var age: Int){


    /**
     * here the secondary constructor calls the primary constructor
     * primary constructor which declares properties and stores the value
     */

//    parameter                     primary constructor
    constructor(fName: String):this(fName,"Gajendran",25){
        println(fName + lastName + age)
    }
    constructor(fName: String,lName:String):this(fName,lName,25)
//    constructor(fName: String,lName: String,a:Int):this(fName,lName,a)
}