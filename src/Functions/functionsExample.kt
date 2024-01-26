package Functions

fun main(){
    /**
     * To declare a function, use keyword fun
     * we can pass parameters to a function
     * parameter => assigning a type of variable to pass
     * argument => passing the value of the parameter
     */

    /**
     * when you assign value with parameter name = "",age=  => this is called named arguments
     */
    myName(age = 20, name = "Tharangini Gajendran")

    var no_connection = false
    if (no_connection != false){
        checkConnectivity("There is connectivity")
    }
    else{
        checkConnectivity("No connectivity")
    }
}

fun myName(name: String, age: Int){
    println("My name is $name and Age is $age")
}
fun checkConnectivity(data: String){
    println(data)
}