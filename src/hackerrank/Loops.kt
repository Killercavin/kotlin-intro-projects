package hackerrank

fun main() {
    val testCases = readln().toInt()
    repeat(testCases) {
        val s = readln()
        val evenChars = StringBuilder()
        val oddChars = StringBuilder()

        for (i in s.indices) {
            if (i % 2 == 0) {
                evenChars.append(s[i])
            } else {
                oddChars.append(s[i])
            }
        }

        println("$evenChars $oddChars")
    }
}
