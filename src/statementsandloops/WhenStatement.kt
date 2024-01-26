package statementsandloops

fun main() {
    val number = 20
    when (number) {
        1 -> println("1 is Wrong Number")
        2 -> println("2 is Wrong Number")
        else -> println("I guess im right")
    }

    val alarm = 2
    val text = when (alarm) {
        1, 4, 5 -> "Its not the time"
        in 1..6 -> "Im here in range"
        else -> "Its the time"
    }
    println(text)

}