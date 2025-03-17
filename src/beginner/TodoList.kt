package beginner


fun main() {
    val todoList = mutableListOf<String>()
    print("Enter your task: ")
    val task = readlnOrNull()

    if (task == null || task == "") {
        throw IllegalArgumentException("Task can't be null or empty")
    } else{
        todoList.add(task)
    }

    when {
        todoList.isEmpty() -> println("No todo task")
        else -> println("Tasks list: $todoList")
    }
}