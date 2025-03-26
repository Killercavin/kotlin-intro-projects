package intermediate

class BankAccount(private val owner: String, initialBalance: Double) {
    private var balance: Double = if (initialBalance >= 0) initialBalance else 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("$owner deposited \$$amount. New balance: \$$balance")
        } else {
            println("Invalid deposit amount. Please enter a positive value.")
        }
    }

    fun withdraw(amount: Double) {
        try {
            if (amount <= 0) throw IllegalArgumentException("Withdrawal amount must be positive.")
            if (amount > balance) throw IllegalStateException("Insufficient funds!")

            balance -= amount
            println("$owner withdrew \$$amount. New balance: \$$balance")
        } catch (e: Exception) {
            println("Transaction failed: ${e.message}")
        }
    }

    fun checkBalance() {
        println("$owner's balance: \$$balance")
    }
}

fun main() {
    val myAccount = BankAccount("Vibe Coder", 100.0)

    myAccount.checkBalance()  // Initial balance
    myAccount.deposit(50.0)    // Deposit $50
    myAccount.withdraw(30.0)   // Withdraw $30
    myAccount.withdraw(200.0)  // Try to withdraw more than balance (should fail)
    myAccount.withdraw(-10.0)  // Try to withdraw a negative amount (should fail)
}
