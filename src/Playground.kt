fun main(){
    val shoppingCart = mutableMapOf("Banana" to 10, "Apple" to 75, "Mango" to 45, "Orange" to 25)

    println("=================================================================")
    println("Filtered map of fruits whose prices are greater than 50.")
    println("=================================================================")
    // get items with values <= 18 only
    val filtered = shoppingCart.filter { (_, value) -> value > 50 }
    println(filtered)


    for ((key, value) in shoppingCart) {
        println("$key = $value")
    }

    val map = mutableMapOf(1 to "A", 2 to "B")
    map[3] = "C"

    val sorted = shoppingCart.toList().sortedBy { (_, value) -> value }.toMap()
    println(sorted)

}