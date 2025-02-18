package exercises_kit.arrays.easy

/**
 * 1
 * Given a 6x6 2D array, arr, an hourglass is a subset
 * of values with indices falling in the following pattern:
 *
 * a b c
 *   d
 * e f g
 *
 * There are 16 hourglasses in a 6x6 array. The hourglass sum
 * is the sum of the values in an hourglass.
 * Calculate the hourglass sum for every hourglass in arr,
 * then print the maximum hourglass sum.
 *
 * Example
 *
 * -9 -9 -9  1  1  1
 *  0 -9  0  4  3  2
 * -9 -9 -9  1  2  3
 *  0  0  8  6  6  0
 *  0  0  0 -2  0  0
 *  0  0  1  2  4  0
 *
 * The 16 hourglass sums are:
 *
 * -63, -34, -9, 12,
 * -10,   0, 28, 23,
 * -27, -11, -2, 10,
 *   9,  17, 25, 18
 *
 * The highest hourglass sum is 28 from the hourglass beginning at row 1, column 2:
 * 0 4 3
 *   1
 * 8 6 6
 */

fun hourglassSum(arr: Array<Array<Int>>): Int {
    // Write your code here
    val sumList = mutableListOf<Int>()

    for (row in 1..4) {
        for (column in 1..4) {
            val top = arr[row-1][column-1] + arr[row-1][column] + arr[row-1][column+1]
            val middle = arr[row][column]
            val bottom = arr[row+1][column-1] + arr[row+1][column] + arr[row+1][column+1]
            val hourglass = top + middle + bottom

            sumList.add(hourglass)
        }
    }

    val maxSum = sumList.max()
    return maxSum
}

fun main(args: Array<String>) {
    val arr = arrayOf(
        arrayOf(1, 1, 1, 0, 0, 0),
        arrayOf(0, 1, 0, 0, 0, 0),
        arrayOf(1, 1, 1, 0, 0, 0),
        arrayOf(0, 0, 2, 4, 4, 0),
        arrayOf(0, 0, 0, 2, 0, 0),
        arrayOf(0, 0, 1, 2, 4, 0)
    )

    /*val arr = arrayOf(
        arrayOf(0, -4, -6, 0, -7, -6),
        arrayOf(-1, -2, -6, -8, -3, -1),
        arrayOf(-8, -4, -2, -8, -8, -6),
        arrayOf(-3, -1, -2, -5, -7, -4),
        arrayOf(-3, -5, -3, -6, -6, -6),
        arrayOf(-3, -6, 0, -8, -6, -7)
    )*/

    val result = hourglassSum(arr)

    println(result)
}