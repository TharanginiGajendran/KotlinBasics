package OOPS

/**
 * Data class ia a special class, primarily used to hold data
 * It automatically generates several standard functions such as "toString()",
 * "equals()","hashcode()", and copy() based on the property declared inside the primary constructor
 *
 * data class usually used for modelling simple data structures
 *
 */

fun main() {
    val dataUser = MyDetails("Tharangini", "Gajendran", 25)

//    default toString() representation
    println(dataUser)
//    using component function

    println(dataUser.copy("Thara", "Gajendran", 23))

    // Using destructuring declarations
    val (firstname, lastName, age) = dataUser
    println("Destructured: $firstname $lastName is $age years old")
}

data class MyDetails(var firstname: String, var lastName: String, var age: Int) {

}