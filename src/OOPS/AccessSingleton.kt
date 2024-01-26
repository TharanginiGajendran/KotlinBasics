package OOPS

/**
 * lets access appconfig from singleton
 * can also modify its value
 */

fun main(){
    val carMan = Car()
    println(carMan.carName)

    val app = AppConfig()
    app.appInfo()

//    updating the value
    MySingleton.appName = "Test App"
    MySingleton.versionCode = 2
    MySingleton.isInstalled = false

    app.appInfo()

}

class AppConfig(){
    fun appInfo(){
//        return "App Name: ${MySingleton.appName}"
        println("App Name: ${MySingleton.appName}")
        println("Version: ${MySingleton.versionCode}")
        println("Installed: ${MySingleton.isInstalled}")
    }
}