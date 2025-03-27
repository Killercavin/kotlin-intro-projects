package intermediate

import java.util.Scanner

class Account(
    private var balance: Double,
    private var previousTransaction: Double = 0.0,
    private val customerName: String,
    private val customerId: String
) {

    // Deposit function
    private fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            previousTransaction = amount
            println("Deposited: $$amount")
        }
    }

    // Withdraw function
    private fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            previousTransaction = -amount
            println("Withdrawn: $$amount")
        } else {
            println("Insufficient balance!")
        }
    }

    // Function to show the previous transaction
    private fun getPreviousTransaction() {
        when {
            previousTransaction > 0 -> println("Deposited: $$previousTransaction")
            previousTransaction < 0 -> println("Withdrawn: $${-previousTransaction}")
            else -> println("No transaction occurred")
        }
    }

    // Function to calculate interest
    private fun calculateInterest(years: Int) {
        val interestRate = 0.0185
        val newBalance = (balance * interestRate * years) + balance
        println("The current interest rate is ${100 * interestRate}%")
        println("After $years years, your balance will be: $$newBalance")
    }

    // Function to display the menu
    fun showMenu() {
        val scanner = Scanner(System.`in`)
        var option: Char

        println("Welcome, $customerName!")
        println("Your ID is: $customerId")

        do {
            println("\nWhat would you like to do?")
            println("A. Check your balance")
            println("B. Make a deposit")
            println("C. Make a withdrawal")
            println("D. View previous transaction")
            println("E. Calculate interest")
            println("F. Exit")
            println("\nEnter an option:")

            option = scanner.next()[0].uppercaseChar()

            when (option) {
                'A' -> {
                    println("===================================")
                    println("Balance = $$balance")
                    println("===================================")
                }
                'B' -> {
                    print("Enter an amount to deposit: ")
                    val amount = scanner.nextDouble()
                    deposit(amount)
                }
                'C' -> {
                    print("Enter an amount to withdraw: ")
                    val amount = scanner.nextDouble()
                    withdraw(amount)
                }
                'D' -> {
                    println("===================================")
                    getPreviousTransaction()
                    println("===================================")
                }
                'E' -> {
                    print("Enter number of years to calculate interest: ")
                    val years = scanner.nextInt()
                    calculateInterest(years)
                }
                'F' -> println("Exiting... Thank you for banking with us!")
                else -> println("Invalid option. Please select A, B, C, D, E, or F.")
            }
        } while (option != 'F')
    }
}

// Main function to test the Account class
fun main() {
    val myAccount = Account(balance = 500.0, customerName = "John Doe", customerId = "123456")
    myAccount.showMenu()
}
