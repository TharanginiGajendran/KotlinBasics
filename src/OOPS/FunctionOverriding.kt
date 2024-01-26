package OOPS

/**
 * function overlaoding is used in inheritance, when child class inherits from parents class functions
 * or properties
 * it overrides it in the child class
 */
/**
 * if the super is overridden the function will load logic from parent class also
 */
fun main(){
    val childBook = childrenBook("one piece")
    childBook.read()
    childBook.write()
    childBook.loveBooks()
//    childBook.project = "CTG eyil project"
}
open class ComicBook(var bookName: String, var author: String){
    open lateinit var project: String

   open fun read(){
        println("the book $bookName is good to read")
    }
    open fun write(){
        println("the book $bookName is written by $author")
    }
}

class childrenBook(bookName: String):ComicBook(bookName,"Chetan"){

    override var project: String
        get() = super.project
        set(value) {
            println("$value")
        }

    override fun read() {
//        super.read()
        println("The book name is $bookName")
    }

    override fun write() {
//        super.write()
        println("The book is written by $author")
    }
    fun loveBooks(){
        println("I love reading $bookName this book")
    }
}