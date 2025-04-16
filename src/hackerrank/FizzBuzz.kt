package hackerrank


/*
 * Complete the 'fizzBuzz' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun fizzBuzz(n: Int) {
    // Write your code here
    for (i in 1..n) {
        if (i % 5 == 0 && i % 3 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}

fun main() {
    val n = readln().trim().toInt()

    fizzBuzz(n)
}
