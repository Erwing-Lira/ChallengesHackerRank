package dataStructures.searching

fun main() {
    println(find(arrayOf(1,2,3,4,5,6,7,8,9,10), 4))
    println(find(arrayOf(1,2,3,4,5,6,7,8,9), 7))
}

fun find(arr: Array<Int>, target: Int): Int {
    var left = 0
    var right = arr.lastIndex

    while (left <= right) {
        val mid = (left + right) / 2

        when {
            arr[mid] == target -> return mid
            arr[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}