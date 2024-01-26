package OOPS

/**
 * Abstract class is a class that cannot be instantiated on its own
 * abstract class Abstract(){
 * }
 * val abstract = Abstract() => you cannot do like this with abstract
 * Abstract class are subclassed by another class
 *
 *Abstract class may contain abstract or non abstract functions and properties
 * Abstract method inside the abstract class should be declared without a body and that should be
 * implemented by class which has abstract class as its subclass
 */
fun main(){

    val abExample = ImplementAbstract("Priya")
    abExample.abstractFun()
    abExample.nonAbstractMethod()
}

class ImplementAbstract(override val MyName: String) :MyAbstractTest(){
    override fun abstractFun() {
        println("Im a abstract method implemented from a abstract class")
    }

}

abstract class MyAbstractTest(){
    abstract val MyName: String
    fun nonAbstractMethod()
    {
        println("Non Abstract $MyName")
        println("Im a non abstract function")
    }

    abstract fun abstractFun()
}