package excersises_week_preparation.problem_solving.dataStructures.implementation.easy

/**
 * 7
 * Given an array of integers and a positive integer k,
 * determine the number of (i,j) pairs where i<j and
 * ar[i] + ar[j] is divisible by k.
 *
 * Example
 * ar = [1,2,3,4,5,6]
 * k = 5
 *
 * Three pairs meet the criteria:
 *  i<j  ->         ar[i] + ar[j]
 * [0,3] -> [1,4] -> 1 + 4 = 5
 * [1,2] -> [2,3] -> 2 + 3 = 5
 * [3,5] -> [4, 6] -> 4 + 6 = 10
 */

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    // Write your code here
    var pairs = 0

    for (i in ar.indices) {
        for (j in i + 1 until n) {
            if ((ar[i] + ar[j]) % k == 0) {
                pairs++
            }
        }
    }
    return pairs
}

fun main(args: Array<String>) {
    val n = 6
    val k = 3

    val ar = arrayOf(1,3,2,6,1,2)

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}