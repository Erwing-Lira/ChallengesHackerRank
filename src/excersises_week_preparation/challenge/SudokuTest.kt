package excersises_week_preparation.challenge

fun main() {
    val arr = arrayOf(
        intArrayOf(1,2,3, 1,2,3, 1,2,3),
        intArrayOf(4,5,6, 4,5,6, 4,5,6),
        intArrayOf(7,8,9, 7,8,9, 7,8,9),

        intArrayOf(1,2,3, 1,2,3, 1,2,3),
        intArrayOf(4,5,6, 4,5,6, 4,5,6),
        intArrayOf(7,8,9, 7,8,9, 7,8,9),

        intArrayOf(1,2,3, 1,2,3, 1,2,3),
        intArrayOf(4,5,6, 4,5,6, 4,5,6),
        intArrayOf(7,8,9, 7,8,9, 7,8,9),
    )

    println(arr.size)
    for (i in 0 until arr.size) {
        println("Fila $i")
        row(arr, i)

        println("Columna $i")
        column(arr, i)

        println("Box $i")
        box(arr, i)
    }
}

fun row(arr: Array<IntArray>, row: Int) {
    for (i in arr[row].indices) {
        println(arr[row][i])
    }
}

fun column(arr: Array<IntArray>, column: Int) {
    for (i in arr[column].indices) {
        println(arr[i][column])
    }
}

fun box(arr: Array<IntArray>, box: Int) {
    val startRow = (box / 3) * 3
    val starColumn = (box % 3) * 3

    for (i in startRow until startRow + 3) {
        for (j in starColumn until starColumn + 3) {
            println(arr[i][j])
        }
    }
}