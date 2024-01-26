package OOPS

/**
 * Interface is a blueprint for class or multiple classes
 * Interface are created only to be implemented by classes
 * Interface cannot be instantiated
 * Interface contains properties and methods, a class which implements it should be implemented
 *
 * A function inside the interface without body should be overriden by the class
 */

fun main(){
    val classNormal = ImplementInterface("Tharangini Gajendran")
    println(classNormal.myName)
    classNormal.testInterfaceAbstract()
    classNormal.run()
    classNormal.interfaceFunction()
}


interface MyInterface{

//    should be implemented by class
    val myName: String

    fun interfaceFunction(){
        println("interface function")
    }
    fun run(){
        println("Running")
    }
//    should be implemented by class
    fun testInterfaceAbstract()
}

class ImplementInterface(override val myName: String): MyInterface{
    override fun testInterfaceAbstract() {
        println("Im without function body and im abstract")
    }
}