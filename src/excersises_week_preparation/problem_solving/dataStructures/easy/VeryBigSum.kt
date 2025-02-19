package excersises_week_preparation.problem_solving.dataStructures.easy

/**
 * 4
 * In this challenge, you need to calculate and
 * print the sum of elements in an array, considering
 * that some integers may be very large.
 */

fun aVeryBigSum(ar: Array<Long>): Long {
    // Write your code here
    var sum: Long = 0
    for(longNumber in ar) {
        sum+=longNumber
    }
    return sum
}

fun main(args: Array<String>) {
    val ar = arrayOf<Long>(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)

    val result = aVeryBigSum(ar)

    println(result)
}