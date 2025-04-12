package hackerrank

import kotlin.io.*
import kotlin.text.*



fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    // conditional check
    if (n % 2 == 1){
        println("Weird")
    } else {
        when {
            n in 2..5 || n > 20 -> println("Not Weird")
            else -> println("Weird")
        }
    }
}
