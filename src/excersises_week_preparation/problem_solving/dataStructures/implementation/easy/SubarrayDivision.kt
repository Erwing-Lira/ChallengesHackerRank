package excersises_week_preparation.problem_solving.dataStructures.implementation.easy

/**
 * 6
 * Two children, Lily and Ron, want to share a chocolate bar.
 * Each of the squares has an integer on it.
 *
 * Lily decides to share a contiguous segment of the bar selected such that:
 *
 * - The length of the segment matches Ron's birth month, and,
 * - The sum of the integers on the squares is equal to his birth day.
 *
 * Determine how many ways she can divide the chocolate.
 *
 * Example
 * s = [2,2,1,3,2]
 * d = 4
 * m = 2
 *
 * Lily wants to find segments summing to Ron's birth day, d = 4
 * with a length equalling his birth month, m = 2. In this case,
 * there are two segments meeting her criteria: [2,2] and [1,3].
 */
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    var numOfPairs = 0
    for (index in 0..s.size - m) {
        if (s.sliceArray(index..<index + m).sum() == d) {
            numOfPairs++
        }
    }
    return numOfPairs
}

fun main(args: Array<String>) {
    val s = arrayOf(1,2,1,3,2)
    val d = 3
    val m = 2

    /*val s = arrayOf(4)
    val d = 4
    val m = 1*/

    val result = birthday(s, d, m)

    println(result)
}