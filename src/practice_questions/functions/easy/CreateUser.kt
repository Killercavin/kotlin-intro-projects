package practice_questions.functions.easy

/*
Named Arguments: Create a function createUser with parameters: name, age, email, and city. Call it using named arguments in different orders.
 */

fun createUser(name: String, age: Int, email: String, city: String) {
    println("My name is $name and I'm $age years old. Currently I reside at $city city and my email is $email")
}

fun main() {
    createUser(city = "Ohio", age = 9, name = "Jack", email = "jack@test.test")
}