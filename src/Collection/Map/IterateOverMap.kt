package Collection.Map

fun main(){
    val mapValue = mutableMapOf("Thara" to 1,"Vikram" to 2,"Tom" to 3,"Hanks" to 4)

    mapValue.forEach {
        println(it)
    }

    for ((key,value) in mapValue){
        println("key = $key, value = $value")
    }
}