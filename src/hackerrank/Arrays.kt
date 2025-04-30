package hackerrank

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    require(arr.size == n)
    println(arr.reversed().joinToString(" "))
}
