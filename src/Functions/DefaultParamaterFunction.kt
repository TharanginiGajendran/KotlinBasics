package Functions

 fun main(){
     defaultParameter("Tharangini")
 }

/**
 * if values are empty assigns a default values from the parameter
 */
fun defaultParameter(firstName: String = "Thara",lastName: String = "Gajendran"){
    println("Im $firstName $lastName")
}