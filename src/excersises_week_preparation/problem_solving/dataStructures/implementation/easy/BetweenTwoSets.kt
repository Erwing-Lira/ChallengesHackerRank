package excersises_week_preparation.problem_solving.dataStructures.implementation.easy

/**
 * 4
 * There will be two arrays of integers.
 * Determine all integers that satisfy the following two conditions:
 *
 * 1. The elements of the first array are all factors
 * of the integer being considered
 * 2. The integer being considered is a factor of
 * all elements of the second array
 * These numbers are referred to as being between the
 * two arrays. Determine how many such numbers exist.
 *
 * Example
 * a = [2,6]
 * b = [24,36]
 *
 * There are two numbers between the arrays: 6 and 12.
 * 6%2 = 0, 6%6 = 0, 24%6 = 0 and 36%6 = 0 for the first value.
 * 12%2 = 0, 12%6 = 0 and 24%12 = 0, 36%12 = 0 for the second value.
 * Return 2
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    val lCM = a.reduce { acc, num -> getLCM(acc, num) }
    val gCD = b.reduce { acc, num -> getGCD(acc, num) }

    var count = 0
    var multiple = lCM

    while (multiple <= gCD) {
        if (gCD % multiple == 0) {
            count++
        }
        multiple += lCM
    }
    return count
}

// Euclides
fun getGCD(a: Int, b: Int): Int = if (b == 0) a else getGCD(b, a % b)

fun getLCM(a: Int, b: Int): Int = (a / getGCD(a, b)) * b

fun main(args: Array<String>) {
    //val arr = arrayOf(2,4)
    // val brr = arrayOf(16,32,96)

    val arr = arrayOf(12,18,24)
    val brr = arrayOf(24,36)

    val total = getTotalX(arr, brr)

    println(total)
}