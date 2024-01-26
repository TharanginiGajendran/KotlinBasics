package operators

fun main(){
    var num = 1..6
    println(num)



    for (i in 1..20){
        if (i % 2 == 0){
            println("even: $i")
        }
        else{
            println("odd")
        }
    }
}