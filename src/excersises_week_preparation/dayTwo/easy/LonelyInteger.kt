package excersises_week_preparation.dayTwo.easy

/**
 * 1
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 *
 * Example
 * a = [1,2,3,4,3,2,1]
 *
 * The unique element is 4.
 */

fun lonelyInteger(a: Array<Int>): Int {
    // Write your code here
    val res = a.groupBy { it }
        .filter { it.value.size == 1 }
        .keys
        .first()

    return res
}

fun main(args: Array<String>) {
    val n = 7

    val a = arrayOf(1,2,3,4,3,2,1)

    val result = lonelyInteger(a)

    println(result)
}