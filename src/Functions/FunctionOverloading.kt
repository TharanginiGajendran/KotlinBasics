package Functions

fun main(){

    println(getMax(a = 29,b=44))
    println(getMax(10,23,23))
    println(getMax(2.3,23))
}

fun getMax(a: Int,b: Int): Int {
    if(a>b){
        return a
    }
    else{
        return b
    }
}

fun getMax(a: Int,b: Int,c:Int): Int{
    var sum = a + b + c
    return sum
}

fun getMax(a: Double,b: Int): Double{
    var sum = a + b
    return sum
}