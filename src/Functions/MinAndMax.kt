package Functions

fun main() {

    var max = findMaxBetweenTwoNumbers(12, 56)
    println("Max value is $max")

    var min = findMin(347, 78)
    println("Min value is $min")
}

fun findMaxBetweenTwoNumbers(a: Int, b: Int): Int {
    var findMax = if (a > b) a else b
    return findMax
}

fun findMin(x: Int, y: Int): Int {
    if (x < y) {
        return x
    } else {
        return y
    }
}