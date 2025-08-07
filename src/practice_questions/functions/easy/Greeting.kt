package practice_questions.functions.easy

/*
Function Basics: Write a function called greet that takes a name as a parameter and returns "Hello, [name]!"
 */

fun greeting(name: String): String = "Hello, $name!"

fun main() {
    print("Enter your name: ")
    val name = readln()
    println(greeting(name))
}