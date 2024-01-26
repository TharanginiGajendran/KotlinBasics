package Functions

fun main(){
    namedParameter(lastName = "Gajendran", firstName = "Tharangini")
}
fun namedParameter(firstName: String = "",lastName: String){
    println("Im $firstName $lastName")
}