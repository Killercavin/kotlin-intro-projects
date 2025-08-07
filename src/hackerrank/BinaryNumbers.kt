package hackerrank

fun maxConsecutiveOnes(n: Int): Int {
    val binary = n.toString(2)
    return binary.split('0').maxOf { it.length }
}

fun main() {
    val n = 5
    println(maxConsecutiveOnes(n)) // Output: 3
}
