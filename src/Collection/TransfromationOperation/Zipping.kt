package Collection.TransfromationOperation

/**
 * Zipping -> combining two or more collection elements into creating a new collection
 * if collection has two different sizes the zip truncates
 * the result to the smallest collection size
 */

fun main(){
    zipping()
    zippingSizeDefault()
}

fun zipping(){
    val list1 = listOf("apple","orange","banana","strawberry")
    val list2 = listOf(1,2,3,4,5,6)

    val zipTwoList = list1.zip(list2)
    println("zip: $zipTwoList")
}

fun zippingSizeDefault(){
    val list1 = listOf("apple","orange","banana","strawberry")
    val list2 = listOf(1,2,3,4,5,6)

   val combine = list2.zip(list1)
//   lambda function
   {
       list2,list1 -> "The ${list1.replaceFirstChar { it.uppercase()}}"
   }

    println(combine)
}