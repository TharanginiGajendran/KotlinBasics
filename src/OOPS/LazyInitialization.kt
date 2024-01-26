package OOPS

/**
 * Lazy initialization is used when creating an instance or object is expensive
 * expensive =>means it will take some or it will use some memory
 *
 * If you use lazy initialization object, it will get invoked only when you use that
 * object in your code
 *
 */
//
val lazyVariable: String by lazy {
    println("Initializing Lazy")
    "Hello Lazy"
}



fun main(){
    println("Before Initializing lazy")
    println(lazyVariable)

    println("After Initializing lazy")
    println(lazyVariable)
}