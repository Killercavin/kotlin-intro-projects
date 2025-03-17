package beginner

data class Task(val name: String, var status: String = "Pending")

fun main() {
    val todoList = mutableListOf<Task>()
    val archivedTasks = mutableListOf<Task>()

    while (true) {
        println("\n1. Add Task\n2. Mark Task as Completed\n3. View Tasks\n4. View Archive\n5. Exit")
        print("Choose an option: ")
        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                print("Enter your task: ")
                val taskName = readlnOrNull()?.trim()

                if (taskName.isNullOrEmpty()) {
                    println("❌ Task can't be empty!")
                } else {
                    todoList.add(Task(taskName))
                    println("✅ Task added!")
                }
            }
            2 -> {
                if (todoList.isEmpty()) {
                    println("❌ No pending tasks!")
                } else {
                    println("Pending Tasks:")
                    todoList.forEachIndexed { index, task -> println("${index + 1}. ${task.name} [${task.status}]") }

                    print("Enter the task number to mark as completed: ")
                    val taskIndex = readlnOrNull()?.toIntOrNull()?.minus(1)

                    if (taskIndex != null && taskIndex in todoList.indices) {
                        val completedTask = todoList.removeAt(taskIndex)
                        completedTask.status = "Completed"
                        archivedTasks.add(completedTask)
                        println("✅ Task marked as completed!")
                    } else {
                        println("❌ Invalid task number!")
                    }
                }
            }
            3 -> {
                if (todoList.isEmpty()) {
                    println("📌 No pending tasks!")
                } else {
                    println("📋 Tasks List:")
                    todoList.forEachIndexed { index, task -> println("${index + 1}. ${task.name} [${task.status}]") }
                }
            }
            4 -> {
                if (archivedTasks.isEmpty()) {
                    println("📂 No archived tasks!")
                } else {
                    println("📜 Archived Tasks:")
                    archivedTasks.forEach { println("✅ ${it.name}") }
                }
            }
            5 -> {
                println("👋 Exiting... See you later!")
                return
            }
            else -> println("❌ Invalid choice! Try again.")
        }
    }
}
