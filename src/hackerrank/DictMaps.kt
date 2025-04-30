package hackerrank

fun main() {
    val n = readln().toInt()
    val phoneBook = mutableMapOf<String, String>()

    // Read n entries into the map
    repeat(n) {
        val (name, number) = readln().split(" ")
        phoneBook[name] = number
    }

    // Read remaining queries until EOF (end of input)
    while (true) {
        val query = readlnOrNull() ?: break
        val result = phoneBook[query]
        if (result != null) {
            println("$query=$result")
        } else {
            println("Not found")
        }
    }
}

