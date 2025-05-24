fun calculator(a: Int, b: Int, operators: Char) {
    when (operators) {
        '+' -> println(a + b)
        '-' -> println(a - b)
        '*' -> println(a * b)
        '/' -> try {
            println(a / b)
        } catch (e: ArithmeticException) {
            println(e.message)
        }

        '%' -> println(a % b)
        else -> throw IllegalArgumentException("Invalid operator")
    }
}

fun main() {
    print("Enter the first number: ")
    val firstNumber = readln().toInt()

    print("Enter the second number: ")
    val secondNumber = readln().toInt()

    print("Enter a operator ie (+, -, /, *, %...): ")
    val operator = readln().first()

    calculator(firstNumber, secondNumber, operator)
}