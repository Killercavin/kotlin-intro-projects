import kotlin.random.Random

fun generateTemperature(seed: Int): String{
    // write your code here
    val random = Random(seed)
    return (1..7).map { random.nextInt(20, 30) }.joinToString(" ")
}


fun main() {
    print(generateTemperature(1))
}