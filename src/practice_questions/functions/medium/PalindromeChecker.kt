package practice_questions.functions.medium

/*
Extension Functions: Create an extension function for String called isPalindrome that checks if a string reads the same forwards and backwards.
 */

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun main() {
    print("Enter the string to check: ")
    val checker = readln().isPalindrome()
    if (checker) {
        println("The string is a palindrome")
    } else {
        println("The string is not a palindrome")
    }
}
