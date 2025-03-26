package beginner

fun main() {
    try {
        val grade = readln().toInt()

        if (grade !in 0..100) {
            println("Grade must be between 0 and 100")
        } else {
            println(
                when (grade) {
                    in 0..39 -> "F"
                    in 40..59 -> "D"
                    in 60..69 -> "C"
                    in 70..79 -> "B"
                    else -> "A"
                }
            )
        }
    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter a number.")
    }
}
