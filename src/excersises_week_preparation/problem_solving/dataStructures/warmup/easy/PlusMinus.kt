package excersises_week_preparation.problem_solving.dataStructures.warmup.easy

/**
 * 1
 * Given an array of integers, calculate the ratios
 * of its elements that are positive, negative,
 * and zero. Print the decimal value of each
 * fraction on a new line with 6 places after the decimal.
 *
 * Note: This challenge introduces precision problems.
 * The test cases are scaled to six decimal places,
 * though answers with absolute error of up to 10 elevated
 * to 4 are acceptable.
 *
 * Example
 * ar = [1,1,0,-1,-1]
 *
 * There are n = 5 elements, two positive, two negative and
 * one zero. Their ratios are 2/5 = 0.400000, 2/5 = 0.400000
 * and 1/5 = 0.200000
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    val size = arr.size
    val positiveValues = arr.count {
        it > 0
    }.toFloat()
    printValue(size, positiveValues)
    val negativeValues = arr.count {
        it < 0
    }.toFloat()
    printValue(size, negativeValues)
    val zeroValues: Float = arr.count {
        it == 0
    }.toFloat()
    printValue(size, zeroValues)
}

private fun printValue(size: Int, value: Float) {
    println(String.format("%.6f", value/size))
}

fun main(args: Array<String>) {
    val arr = arrayOf(-4, 3, -9, 0, 4, 1)

    plusMinus(arr)
}
