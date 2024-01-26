package OOPS

/**
 * singleton is a design pattern, can be declared using object keyword
 * singleton with which you can have only one instance of that object to be globally available
 *
 */


//fun main(){
////    val single = MySingleton
////    single.testSingleton()
//}

object MySingleton{
    var appName = "Kotlin App"
    var versionCode = 1
    var isInstalled = true

}