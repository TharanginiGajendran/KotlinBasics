package Arrays

fun main(){
    /**
     * arrays are modified using its index
     * arrays are mutable
     * it has fixed size,size cannot be modified once it is initialized
     * if you try access array size, which is not present it will throw index out of bound exception
     */
    val names:Array<String>  = arrayOf("Thara","Tom","Hanks","Ajay","cruise","Vijay")
    names[0] = "Tharangini"
//    names[5] = "TTT"
    println(names[5])
}