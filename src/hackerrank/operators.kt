package hackerrank

/*
 * Complete the 'solve' function below.
 *
 * The function accepts following parameters:
 *  1. DOUBLE meal_cost
 *  2. INTEGER tip_percent
 *  3. INTEGER tax_percent
 */

import kotlin.math.round

fun solve(mealCost: Double, tipPercent: Int, taxPercent: Int) {
    val tip = mealCost * tipPercent / 100
    val tax = mealCost * taxPercent / 100
    val totalCost = mealCost + tip + tax
    println(round(totalCost).toInt())
}


fun main() {
    val mealCost = readln().trim().toDouble()

    val tipPercent = readln().trim().toInt()

    val taxPercent = readln().trim().toInt()

    solve(mealCost, tipPercent, taxPercent)
}
