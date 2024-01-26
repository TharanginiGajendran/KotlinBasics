package OOPS

/**
 * Delegation is a design pattern
 * uses by keyword
 */


fun main(){
    val deleg = myDelegation()
    deleg.a()
    deleg.b()
}
class myDelegation : AA by inherA(), BB by inherB(){

}
interface AA{
    fun a()
}

interface BB{
    fun b()
}

open class inherA : AA{
    override fun a() {
        println("inheritance A implemnets interface AA")
    }

}

open class inherB: BB{
    override fun b() {
        println("inheritance B implements interface BB")
    }

}

interface A1{
    fun a1()
}

interface A2{
    fun a2()
}

class Dele(): A2,A1{
    override fun a1() {
        TODO("Not yet implemented")
    }

    override fun a2() {
        TODO("Not yet implemented")
    }

}