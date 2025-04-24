package dataStructures.order

fun quickSort(arr: IntArray, left: Int = 0, right: Int = arr.size - 1): IntArray {
    var start = left
    var end = right
    val pivot = arr[(left + right) / 2]

    while (start <= end) {
        while (arr[start] < pivot) {
            start++
        }
        while (arr[end] > pivot) {
            end--
        }
        if (start <= end) {
            val temp = arr[start]
            arr[start] = arr[end]
            arr[end] = temp
            start++
            end--
        }
    }

    if (left < end) {
        quickSort(arr, left, end)
    }
    if (start < right) {
        quickSort(arr, start, right)
    }
    return arr
}

// out of place
fun quickSort(list: List<Int>): List<Int> {
    if (list.size < 2) return list

    val pivot = list[(list.size - 1) / 2]
    val equal = list.filter { it == pivot }
    val less = list.filter { it < pivot }
    val greater = list.filter { it > pivot }

    return quickSort(less) + equal + quickSort(greater)
}

// in place
fun quickSortInPlace(arr: Array<Int>, low: Int = 0, high: Int = arr.size - 1) {
    if (low < high) {
        val pivotIndex = partition(arr, low, high)
        quickSortInPlace(arr, low, pivotIndex - 1)
        quickSortInPlace(arr, pivotIndex + 1, high)
    }
}

fun partition(arr: Array<Int>, low: Int, high: Int): Int {
    val pivot = arr[high]
    var i = low - 1

    for (j in low until high) {
        if (arr[j] < pivot) {
            i++

            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }
    }

    val temp = arr[i + 1]
    arr[i + 1] = arr[high]
    arr[high] = temp
    return i + 1
}

fun main() {
    val arr = arrayOf(1,5,6,3,6,3)
    quickSortInPlace(arr)
    for (num in arr) {
        println(num)
    }
}