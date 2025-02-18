package excersises_week_preparation.dayTwo.easy

/**
 * Sean invented a game involving a 2n x 2n matrix where each cell
 * of the matrix contains an integer. He can reverse any of
 * its rows or columns any number of times. The goal of the game
 * is to maximize the sum of the elements in the n x n
 * submatrix located in the upper-left quadrant of the matrix.
 *
 * Given the initial configurations for q matrices, help
 * Sean reverse the rows and columns of each matrix in the
 * best possible way so that the sum of the elements in the
 * matrix's upper-left quadrant is maximal.
 *
 * Example:
 * q = [[1,2], [3,4]]
 * 1 2
 * 3 4
 *
 * It is 2x2 and we want to maximize the top
 * left quadrant, a 1x1 matrix. Reverse row 1:
 * 1 2
 * 4 3
 *
 * And now reverse column 0:
 * 4 2
 * 1 3
 *
 * The maximal sum is 4.
 */

fun flippingMatrix(matrix: Array<IntArray>): Int {
    val n = matrix.size / 2
    var maxSum = 0

    for (row in 0 until n) {
        for (column in 0 until n) {
            // Tomamos el máximo valor entre los 4 reflejados
            val maxValue = maxOf(
                matrix[row][column],                         // Original
                matrix[row][2 * n - 1 - column],             // Reflejado horizontalmente
                matrix[2 * n - 1 - row][column],             // Reflejado verticalmente
                matrix[2 * n - 1 - row][2 * n - 1 - column]  // Reflejado diagonalmente
            )
            maxSum += maxValue
        }
    }

    return maxSum
}

fun main() {
    /*val matrix = arrayOf(
        intArrayOf(112, 42, 83, 119),
        intArrayOf(56, 125, 56, 49),
        intArrayOf(15, 78, 101, 43),
        intArrayOf(62, 98, 114, 108)
    )*/
    val matrix = arrayOf(
        intArrayOf(107, 54, 128, 15),
        intArrayOf(12, 75, 110, 138),
        intArrayOf(100, 96, 34, 85),
        intArrayOf(75, 15, 28, 112)
    )

    println(flippingMatrix(matrix))
}