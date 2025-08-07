package hackerrank

fun main() {
    val arr = Array(6) { readln().trim().split(" ").map { it.toInt() }.toTypedArray() }

    var maxSum = Int.MIN_VALUE

    for (i in 0..3) {
        for (j in 0..3) {
            val sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                    arr[i+1][j+1] +
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]

            if (sum > maxSum) {
                maxSum = sum
            }
        }
    }

    println(maxSum)
}
