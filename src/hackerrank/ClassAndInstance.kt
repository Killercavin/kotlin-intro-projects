package hackerrank

class Person(private var age: Int) {

    init {
        if (age < 0) {
            println("Age is not valid, setting age to 0.")
            age = 0
        }
    }

    fun amIOld() {
        when {
            age < 13 -> println("You are young.")
            age in 13..17 -> println("You are a teenager.")
            else -> println("You are old.")
        }
    }

    fun yearPasses() {
        age++
    }
}

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val age = readln().toInt()
        val person = Person(age)
        person.amIOld()
        repeat(3) {
            person.yearPasses()
        }
        person.amIOld()
        println()
    }
}
