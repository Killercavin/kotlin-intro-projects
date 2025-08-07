package hackerrank

/*
 * Complete the 'factorial' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun factorial(n: Int): Int {
    // Write your code here
    return if (n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }

}

fun main() {
    val n = readln().trim().toInt()

    val result = factorial(n)

    println(result)
}
