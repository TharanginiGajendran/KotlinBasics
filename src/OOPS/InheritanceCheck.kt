package OOPS

fun main(){
//    val c = C()
//    c.createA()

    val e = E()
    e.createA()
    e.createD()

}

open class A{
    open fun createA(){
        println("Creating A")
    }
}
open class B {
    open fun createB(){
        println("Creating B")
    }
}

//class C: A(),B() => multiple inheritance is not posiible
class C: A(){
    override fun createA() {
        super.createA()
        println("class C")
    }
}

//multilevel inheritance is posiible open A =>open B :A => C : B
open class D : A(){
    override fun createA() {
        super.createA()
        println("Parent Class D")
    }
    open fun createD(){
        println("Creating D")
    }
}

class E: D(){
    override fun createA() {
        super.createA()
        println("Child class E inherit A")
    }

    override fun createD() {
        super.createD()
        println("Child class E inherit A")
    }
}