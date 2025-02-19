package excersises_week_preparation.problem_solving.dataStructures.warmup.easy

/**
 * 6
 * You are in charge of the cake for a child's birthday.
 * It will have one candle for each year of their total
 * age. They will only be able to blow out the tallest
 * of the candles. Your task is to count how many candles are the tallest.
 *
 * Example
 * arr = [4,4,1,3]
 *
 * The tallest candles are 4 units high. There are 2
 * candles with this height, so the function should return 2.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    val maxValue = candles.max()
    val arr = candles.count {
        it == maxValue
    }

    return arr
}

fun main(args: Array<String>) {
    val candles = arrayOf(3,2,1,3)

    val result = birthdayCakeCandles(candles)

    println(result)
}