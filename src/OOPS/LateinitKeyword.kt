package OOPS

/**
 * lateinit keyword => you can use lateinit if you dont want to assign a value to the variable
 * right away but want to assign later
 *
 * use lateinit keyword
 * if you dont assign value to the lateinit property and it will throw error at runtime
 *
 * Important =>lateinit works with class and non primitive data type(string) but not with
 * primitive data types
 *
 *wrong => lateinit var num: Int
 * right => lateinit var movie: String
 *
 */

fun main(){
    val myMovie = Movie()
//    myMovie.moviename = "Tooooooooooooo"
//    println(myMovie.moviename)
//
//    myMovie.movies()

    myMovie.test("check 123")
    myMovie.prinitProprty()

    myMovie.dash()



}
class Movie{
//    lateinit var number: Int
    lateinit var moviename: String
    lateinit var testLateinitProperty: String
    lateinit var car: Car

    fun dash(){
        car.carName = "ppiko"
        car.move()
        println("${car.carColor}")

    }

//    fun movies(){
//        moviename = "Where Crawdads Sing"
//        println("The movie $moviename starts at 5:30 pm")
//    }

    fun test(value:String){
        testLateinitProperty = value
    }

    fun prinitProprty(){
        if(::testLateinitProperty.isInitialized){
            println(testLateinitProperty)
        }
        else{
            println("Not initializes")
        }
    }

}