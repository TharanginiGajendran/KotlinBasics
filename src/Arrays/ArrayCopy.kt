package Arrays

fun main() {
    /**
     * you can use copy to get duplicate array list
     * if u modify the duplicate list, the original list will be unmodified
     */
    val number: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    val copyArray = number.copyOf()
    println(copyArray[0])
    println(copyArray[1])
    copyArray[2] = 10
    println(copyArray[2])
    println(number[2])
}