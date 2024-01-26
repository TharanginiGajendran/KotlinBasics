package operators

fun main(){
    val word = "Learn kotlin"
    println("kotlin" in word)

    if (word is String){
        println("Im string")
    }
    else{
        println("Im not string")
    }
}