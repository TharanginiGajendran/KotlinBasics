package OOPS

/**
 * another method is you can create a companion object inside a class to make
 * a singleton like behaviour
 *
 */

fun main(){

}

/**
 * to restrict the creation of instances use private keyword
 * when u use access modifier with primary constructor you need to use constructor()
 */
class SingletonMethod private constructor() {
    companion object{
        private var instance: SingletonMethod? = null

        fun getInstance(): SingletonMethod{
            if (instance == null){
                instance = SingletonMethod()
            }
            return instance!!
        }
    }
    var appName = "Kotlin App 123"
    var versionCode = 1
    var isInstalled = true

}