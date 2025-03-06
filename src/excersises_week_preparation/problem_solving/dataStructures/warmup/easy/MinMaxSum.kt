package excersises_week_preparation.problem_solving.dataStructures.warmup.easy

/**
 * 2
 * Given five positive integers, find the minimum and
 * maximum values that can be calculated by summing exactly
 * four of the five integers. Then print the respective
 * minimum and maximum values as a single line of two
 * space-separated long integers.
 *
 * Example
 * ar = [1,2,3,4,5]
 *
 * The minimum sum is 10 and the maximum sum is 14. The function prints
 *
 * The numbers are 1, 2, 3, 4, and 5. Calculate the following
 * sums using four of the five integers:
 *
 * Sum everything except 1, the sum is 2+3+4+5 = 14.
 * Sum everything except 2, the sum is 1+3+4+5 = 13.
 * Sum everything except 3, the sum is 1+2+4+5 = 12.
 * Sum everything except 4, the sum is 1+2+3+5 = 11.
 * Sum everything except 5, the sum is 1+2+3+4 = 10.
 * Hints: Beware of integer overflow! Use 64-bit Integer.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    val sumList = mutableListOf<Long>()
    for (number in arr) {
        sumList.add(arr.sumOf { it.toLong() } - number)
    }
    println("${sumList.min()} ${sumList.max()}")
}

fun main(args: Array<String>) {

    val arr = arrayOf(1,2,3,4,5)

    miniMaxSum(arr)
}
