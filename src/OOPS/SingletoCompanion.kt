package OOPS

fun main(){
    val config = SingletonMethod.getInstance()
    println(config.appName)
    println(config.versionCode)
    println(config.isInstalled)
}