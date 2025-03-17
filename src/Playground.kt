import kotlin.math.pow

fun Int.cubed(): Int {
    // Implement logic here
    return this.toFloat().pow(3).toInt() // not clean and concise may bring some ambiguity my main motivation was to use the inbuilt power method
}

fun main(){
    println(5.cubed())
}