package OOPS


fun main(){
    val ex = Example()
    ex.method()
    ex.delegateionSuccess()
}

interface MyIn{
    fun method()
}
class MyType() : MyIn{
    override fun method() {
        println("My delegate")
    }

}

//class Back(){
//    fun myname(){
//        println("Example")
//    }
//}

class Example(): MyIn by MyType(){
    fun delegateionSuccess(){
        println("i created it")
    }
}