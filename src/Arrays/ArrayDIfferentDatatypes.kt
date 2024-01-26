package Arrays

fun main(){
    val mixed = arrayListOf(1,2,3,"Thara",3.4,4,5f,4L,true)
//    for (i in mixed){
//        println(i)
//    }
    println(mixed)

    for (i in mixed){
        if (i is Int){
            println(i)
        }
    }

}