package OOPS

/**
 * you can provide default value if the arguments for that parameter is not provided
 *
 */

fun main(){
    val user = UserDetails()
    println(user.fName)
    println(user.lName)
    println(user.age)
//    user.details()
//    this is a named arguments
    user.anotherUser(place = "USA", name = "Cruise")

}

//this is default parameter
class UserDetails(var fName: String, var lName:String = "Gajendran", var age: Int = 25){
    /**
     * you cannot use default parameter and named argumets with secondary constructor
     * you can use default parameter and named argumets withsecondary constructor
     */
    constructor(firstName: String = "yyyy"): this(firstName,"lastName",0)
//    fun details(){
//        println("${fName} ${lName} ${age}")
//    }
//    this is default parameters
    fun anotherUser(name: String = "Tom", place: String){
        println("${name},${place}")
    }

}