fun main() {
    val myArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(
        try {
            myArray[12]
        } catch (e: ArrayIndexOutOfBoundsException) {
            "No element found at that index, probably it's out of bound! ${e.message}"
        } finally {
            "Exiting..."
        }
    )
}