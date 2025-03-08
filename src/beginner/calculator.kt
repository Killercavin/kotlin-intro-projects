package beginner

fun main() {
    var firstNumber: Int? = null
    var secondNumber: Int? = null
    var operator: String? = null

    while (firstNumber == null) {
        print("Enter the first number: ")
        firstNumber = readLine()?.toIntOrNull()
        if (firstNumber == null) println("Invalid input! Please enter a valid integer.")
    }

    while (secondNumber == null) {
        print("Enter the second number: ")
        secondNumber = readLine()?.toIntOrNull()
        if (secondNumber == null) println("Invalid input! Please enter a valid integer.")
    }

    val validOperators = setOf("+", "-", "*", "/", "%") // used set over list because of their performance and unique nature even though we initialized it with the required operators
    while (operator !in validOperators) {
        print("Enter the operator (+, -, *, /, %): ")
        operator = readLine()
        if (operator !in validOperators) println("Invalid operator! Choose from +, -, *, /, %.")
    }

    val result = when (operator) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> if (secondNumber == 0) "Error: Division by zero!" else firstNumber / secondNumber
        "%" -> if (secondNumber == 0) "Error: Modulus by zero!" else firstNumber % secondNumber
        else -> "Invalid operator!" // This will never be reached, but it's here to prevent Kotlin from screaming out loud like a horn bill
    }

    println("Result: $firstNumber $operator $secondNumber = $result")
}