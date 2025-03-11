package beginner

import kotlin.math.abs

fun main(){
    var inputNumber: Int? = null

    while (inputNumber == null){
        print("Enter the number you want check for odd or even: ")
        inputNumber = readLine()?.toIntOrNull()
        if (inputNumber == null) println("The input can't be null, string or symbol, please provide a number!")
    }

    // I can use elvis operator or non-nullable and exception to handle the above logic, but I chose simple null one

    val result = when{
        abs(inputNumber) % 2 == 0 -> "The number $inputNumber is even!"
        abs(inputNumber) % 2 == 1 -> "The number $inputNumber is odd!"
        else -> "Invalid"
    }

  /*  try{
        println(result)
    } catch(e: IllegalArgumentException){
        println("${e.message}, please enter a valid number!")
    }*/

    println(result) // the try-catch block above was useless coz all exceptions were handled in the while loop
}