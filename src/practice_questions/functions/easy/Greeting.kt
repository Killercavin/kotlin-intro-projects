package practice_questions.functions.easy

import java.io.IO.readln

/*
Function Basics: Write a function called greet that takes a name as a parameter and returns "Hello, [name]!"
 */

fun greeting(name: String): String = "Hello, $name!"

fun main() {
    println(greeting(readln("Enter your name: ")))
}