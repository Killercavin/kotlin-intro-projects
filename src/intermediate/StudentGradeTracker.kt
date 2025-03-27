package intermediate

fun main() {
    val studentData = mutableMapOf(
        "John" to 5,
        "Jane" to 0,
        "Mary" to 1,
        "Doe" to 2,
        "Will" to 3,
        "Thomas" to 4
    )

    // Function to add a student
    fun addStudent(name: String, grade: Int) {
        if (name !in studentData) {
            studentData[name] = grade
        } else {
            println("$name already exists!")
        }
    }

    // Function to update a student's grade
    fun updateStudent(name: String, grade: Int) {
        if (name in studentData) {
            studentData[name] = grade
        } else {
            println("$name not found!")
        }
    }

    // Function to remove a student
    fun removeStudent(name: String) {
        if (studentData.remove(name) == null) {
            println("$name not found!")
        }
    }

    // Function to calculate the class average
    fun calculateAverage(): Double {
        return if (studentData.isNotEmpty()) studentData.values.average() else 0.0
    }

    // Function to print students sorted by grade
    fun printSortedStudents() {
        val sorted = studentData.entries.sortedByDescending { it.value }
        println("\nStudents sorted by grade:")
        sorted.forEach { println("${it.key}: ${it.value}") }
    }

    // Example usage
    addStudent("Alice", 6)
    updateStudent("Jane", 7)
    removeStudent("Mary")

    println("Student Data: $studentData")
    println("Class Average: ${calculateAverage()}")
    printSortedStudents()
}
