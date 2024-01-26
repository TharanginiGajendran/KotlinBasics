package OOPS

/**
 * Inner class are class inside the another class (outer class)
 * the inner class is a member of inner class and
 * you can have access to the outer class other members
 *
 * you can use inner class inside a another class when you know
 * there is a close relationship between two classes
 */

fun main() {

    val outer = AndroidMobiles(mobileName = "Poorvika", model = "2024")
    println(outer.mobileName)
    println(outer.model)

    //inner class can be accessed by creating a object for outer class
    val inner = outer.IphoneMobiles().innerClassFunction()
    println(inner)


    val outerArray = OuterArray(arrayOf("Pen","Paper","Pencil","Book"))
    outerArray.items
//    for (i in outerArray.items){
//        println(i)
//    }
//    outerArray.items.forEach {
//        println(it)
//    }

    val innerArray = outerArray.InnerArray().displayItems(0)



}

class AndroidMobiles(var mobileName: String,var model: String) {
    private val outerClass = "Im from outer class"

    inner class IphoneMobiles {
        fun innerClassFunction() : String {
           return "Im from inner class access the member of outer class $outerClass $mobileName $model"
        }

    }
}

class OuterArray(var items: Array<String>){
    inner class InnerArray(){
        fun displayItems(position: Int){
            println(items[position])
        }
    }
}