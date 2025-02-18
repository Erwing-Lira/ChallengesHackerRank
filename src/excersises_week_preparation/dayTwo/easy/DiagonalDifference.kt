package excersises_week_preparation.dayTwo.easy

import kotlin.math.abs
/**
 * 2
 * Given a square matrix, calculate the absolute difference
 * between the sums of its diagonals.
 *
 * For example, the square matrix arr is shown below:
 *
 * 1 2 3
 * 4 5 6
 * 9 8 9
 *
 * The left-to-right diagonal = 1+5+9 = 15.
 * The right to left diagonal = 3+5+9 = 17.
 * Their absolute difference is |15 - 17| = 2.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var leftToRightDiagonal = 0
    var rightToLeftDiagonal = 0

    for (row in arr.indices) {
        for (column in arr[row].indices) {
            if (row == column) {
                leftToRightDiagonal += arr[row][column]
            }
            if (row + column == arr.size - 1) {
                rightToLeftDiagonal += arr[row][column]
            }
        }
    }

    val res = leftToRightDiagonal - rightToLeftDiagonal
    return abs(res)
}

fun main(args: Array<String>) {
    val arr = arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5,6),
        arrayOf(9,8,9)
    )

    val result = diagonalDifference(arr)

    println(result)
}