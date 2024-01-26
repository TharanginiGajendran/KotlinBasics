package Collection.TransfromationOperation

/**
 * partition is same like filtering. The difference is it keeps the condition that satisfies in one list
 * and the condition that does not satifies in another list
 *
 */

fun main(){
    partition()
}
fun partition(){
    val list = listOf(1,2,3,4,5,6,7,8,9,10)
    println("list: $list")
    val (condition,notconditin) = list.partition {
        it % 2 == 0
    }
    println("partion: $condition")
    println("Partiton not match: $notconditin")

    val zip = condition.zip(notconditin)
    println("zip: $zip")
}