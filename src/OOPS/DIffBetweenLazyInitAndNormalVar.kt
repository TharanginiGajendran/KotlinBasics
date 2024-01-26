package OOPS

fun main(){

    val book1 = Books("Giraffe","MM")
    val book2 by lazy {
        Books("Lazy None","Lazy None")
    }
//    lazy gets invoked only when i define the object
    book2


}

class Books( bookName:String, author:String){
    init {
        println("$bookName and $author")
    }
}