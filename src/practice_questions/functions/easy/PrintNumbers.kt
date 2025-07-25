package practice_questions.functions.easy

import java.io.IO.readln

/*
Unit Function: Write a function printNumbers that takes an integer and prints numbers from 1 to that integer.
 */

fun printNumbers(number: Int) {
    if (number < 1) {
        println("Number should not be less than or equal to 1")
    } else {
        for (i in 1..number) {
            print("$i ")
        }
    }
}

fun main() {
    printNumbers(readln("Enter the number: ").toInt())
}