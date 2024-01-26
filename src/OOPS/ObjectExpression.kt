package OOPS

/**
 * object expression is a way for you to create an instance of anonymous class or
 * interface without explicitly defining a named class
 */


fun main(){

//    val inherit = Inheritance()
//    inherit.inheritParent()

    val anonymousShape = object : Shape() {
        override fun draw() {
            println("Drawing a custom shape")
        }
    }
    anonymousShape.draw()

    val objectExpressionAnoy = object : AnonymousCheck{
        override fun userDetail(name: String, age: Int) {
            println("My name is $name and age is $age")
        }

    }
    objectExpressionAnoy.userDetail("Tharangini",20)
}

interface AnonymousCheck{
    fun userDetail(name: String, age: Int)
}

open class Shape {
    open fun draw() {
        println("Drawing a shape")
    }
}
