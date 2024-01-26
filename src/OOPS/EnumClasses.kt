package OOPS

/**
 * Ennum is a class which is used to represent the fixed set of values, constants
 * use ennum keyword
 * ennum class can have properties amd functions, constructor
 * mostly used in if conditions and when statements
 */

fun main(){
    println(Direction.EAST)
    println(Direction.NORTH)
    println(Direction.SOUTH)
    println(Direction.WEST)

    ifStatementEnum(Direction.NORTH)
    whenStatementEnum(Direction.NORTH)

     Mobiles.IPHONE.imInsideEnum()


}
enum class Direction{
    /**
     * values or constants inside the enum class are objects(instances) of enum class
      */

    NORTH,
    SOUTH,
    EAST,
    WEST
}

/**
 * using ennum with if statement
 */

fun ifStatementEnum(direction: Direction){
  if (direction == Direction.EAST){
      println("Right direction ${Direction.EAST}")
  }
    else{
        println("Not that direction")
  }
}

//using enum in when statement
fun whenStatementEnum(direction: Direction){
    when(direction){
        Direction.WEST -> println("This is ${Direction.WEST}")
        Direction.SOUTH -> println("This is ${Direction.SOUTH}")
//        Direction.NORTH -> println("This is ${Direction.NORTH}")
//        Direction.EAST -> println("This is ${Direction.EAST}")
        else -> println("you are going in different $direction")
    }

}


enum class Mobiles(val mobile : String){
    IPHONE(mobile = "My mobile iphone ");
    fun imInsideEnum() = println("test function inside the enum $mobile")
}