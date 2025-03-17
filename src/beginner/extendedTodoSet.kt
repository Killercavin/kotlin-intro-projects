package beginner

data class SetOfTask(val name: String, var status: String = "Pending")

fun main() {
    val todoList = mutableSetOf<SetOfTask>()
    val archivedSetOfTasks = mutableListOf<SetOfTask>()

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
                    val newTask = SetOfTask(taskName)
                    if (todoList.add(newTask)) {
                        println("✅ Task added!")
                    } else {
                        println("⚠️ Task already exists!")
                    }
                }
            }
            2 -> {
                if (todoList.isEmpty()) {
                    println("❌ No pending tasks!")
                } else {
                    println("Pending Tasks:")
                    todoList.forEachIndexed { index, task -> println("${index + 1}. ${task.name} [${task.status}]") }

                    print("Enter the task name to mark as completed: ")
                    val taskName = readlnOrNull()?.trim()

                    val task = todoList.find { it.name.equals(taskName, ignoreCase = true) }
                    if (task != null) {
                        todoList.remove(task) // Remove from pending tasks
                        val completedTask = task.copy(status = "Completed") // Create a new completed task
                        archivedSetOfTasks.add(completedTask) // Add to archived tasks
                        println("✅ Task marked as completed!")
                    } else {
                        println("❌ Task not found!")
                    }
                }
            }
            3 -> {
                if (todoList.isEmpty()) {
                    println("📌 No pending tasks!")
                } else {
                    println("📋 Tasks List:")
                    todoList.forEach { println("🔹 ${it.name} [${it.status}]") }
                }
            }
            4 -> {
                if (archivedSetOfTasks.isEmpty()) {
                    println("📂 No archived tasks!")
                } else {
                    println("📜 Archived Tasks:")
                    archivedSetOfTasks.forEach { println("✅ ${it.name} [${it.status}]") }
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


// sets is another thing else damn!