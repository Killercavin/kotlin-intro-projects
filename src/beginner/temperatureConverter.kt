package beginner

fun convertTemperature(value: Double, fromScale: String, toScale: String): Double {
    val validScales = setOf("celsius", "fahrenheit", "kelvin")

    // verify that all the scales are present in validScales
    if (fromScale !in validScales && toScale !in validScales) {
        throw IllegalArgumentException("Invalid scale! Use: Celsius, Fahrenheit, or Kelvin.")
    }

    return when (fromScale to toScale) {
        "celsius" to "fahrenheit" -> (value * 9/5) + 32
        "celsius" to "kelvin" -> value + 273.15
        "fahrenheit" to "celsius" -> (value - 32) * 5/9
        "fahrenheit" to "kelvin" -> (value - 32) * 5/9 + 273.15
        "kelvin" to "celsius" -> value - 273.15
        "kelvin" to "fahrenheit" -> (value - 273.15) * 9/5 + 32
        else -> value // No conversion needed if both scales are the same
    }
}

fun main() {
    var value: Double? = null
    var fromScale: String? = null
    var toScale: String? = null

    while (value == null) {
        print("Enter the value of temperature: ")
        value = readLine()?.toDoubleOrNull()
        if (value == null) println("Invalid input! Please enter a valid temperature.")
    }

    while (fromScale == null || fromScale.lowercase() !in setOf("celsius", "fahrenheit", "kelvin")) {
        print("Enter the scale you want to convert from (Celsius, Fahrenheit, Kelvin): ")
        fromScale = readLine()?.lowercase()
        if (fromScale == null || fromScale !in setOf("celsius", "fahrenheit", "kelvin")) {
            println("Invalid input! Please enter 'Celsius', 'Fahrenheit', or 'Kelvin'.")
            fromScale = null
        }
    }

    while (toScale == null || toScale.lowercase() !in setOf("celsius", "fahrenheit", "kelvin")) {
        print("Enter the scale you want to convert to (Celsius, Fahrenheit, Kelvin): ")
        toScale = readLine()?.lowercase()
        if (toScale == null || toScale !in setOf("celsius", "fahrenheit", "kelvin")) {
            println("Invalid input! Please enter 'Celsius', 'Fahrenheit', or 'Kelvin'.")
            toScale = null
        }
    }

    try {
        val result = convertTemperature(value, fromScale, toScale)
        println("Converted Temperature: $result $toScale")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
