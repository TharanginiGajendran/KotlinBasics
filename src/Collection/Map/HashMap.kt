package Collection.Map


/**
 * hashmap is a unordered collection of key value pair
 * access elements based on key
 */
fun main() {
    hashMapExample()
}

fun hashMapExample() {
    val hashMap: HashMap<String, Int> = hashMapOf("Thara" to 1, "Vikram" to 2, "Tom" to 3)
    hashMap["Vishal"] = 7
    println(hashMap)
    hashMap["Tharangini"] = 1
    println(hashMap)
}