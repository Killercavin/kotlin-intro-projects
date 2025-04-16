package hackerrank


fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr: Array<Int> = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    println(arr.joinToString(" ").reversed())
}
