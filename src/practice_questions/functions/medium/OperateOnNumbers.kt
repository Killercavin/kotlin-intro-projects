package practice_questions.functions.medium

/*
Higher-Order Functions: Write a function operateOnNumbers that takes two integers and a function parameter, then applies that function to the integers.
 */

fun operateOnNumbers(x: Int, y: Int, add: (Int, Int) -> Int) {
    println(add(x, y))
}

fun main() {
    operateOnNumbers(19, 20) { x, y -> x + y }
    operateOnNumbers(345, 569) { x, y -> x + y }
}