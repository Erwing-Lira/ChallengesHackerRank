package excersises_week_preparation.problem_solving.dataStructures.easy

/**
 * Given an array of integers, find the sum of its elements.
 *
 * For example, if the array ,
 * [1,2,3] = 1+2+3, so return 6.
 */

fun simpleArraySum(ar: Array<Int>): Int {
    // Write your code here
    var sum = 0
    for (num in ar) {
        sum+=num
    }
    return sum
}

fun main(args: Array<String>) {
    val ar = arrayOf(1,2,3)

    val result = simpleArraySum(ar)

    println(result)
}