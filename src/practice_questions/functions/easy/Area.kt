package practice_questions.functions.easy

/*
Default Parameters: Create a function calculateArea that calculates the area of a rectangle. Give default values of 1.0 to both length and width parameters.
 */

fun calculateArea(length: Double = 1.0, width: Double = 1.0): Double {
    return length * width
}

fun main() {
    println("The area is ${calculateArea(9.3, 6.7).toFloat()}")
}