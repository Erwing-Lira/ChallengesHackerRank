package dataStructures.order

fun mergeSort(array: IntArray, startIndex: Int = 0, endIndex: Int = array.size-1): IntArray {
    if (array.size <= 1) {
        return array
    }

    val middleIndex = (startIndex + endIndex) / 2
    val leftArray = array.sliceArray(startIndex..middleIndex)
    val rightArray = array.sliceArray(middleIndex + 1..endIndex)

    return merge(mergeSort(leftArray), mergeSort(rightArray))
}

fun merge(leftArray: IntArray, rightArray: IntArray): IntArray {
    val mergedArray = IntArray(leftArray.size + rightArray.size)
    var leftIndex = 0
    var rightIndex = 0
    var mergedIndex = 0

    while (leftIndex < leftArray.size && rightIndex < rightArray.size) {
        if (leftArray[leftIndex] <= rightArray[rightIndex]) {
            mergedArray[mergedIndex] = leftArray[leftIndex]
            leftIndex++
        } else {
            mergedArray[mergedIndex] = rightArray[rightIndex]
            rightIndex++
        }
        mergedIndex++
    }

    while (leftIndex < leftArray.size) {
        mergedArray[mergedIndex] = leftArray[leftIndex]
        leftIndex++
        mergedIndex++
    }

    while (rightIndex < rightArray.size) {
        mergedArray[mergedIndex] = rightArray[rightIndex]
        rightIndex++
        mergedIndex++
    }

    return mergedArray
}

fun mergeSortInPlace(arr: IntArray, left: Int = 0, right: Int = arr.size - 1) {
    if (left >= right) return

    var mid = (left + right) / 2

    mergeSortInPlace(arr, left, mid)
    mergeSortInPlace(arr, mid + 1, right)

    var i = left
    var j = mid + 1

    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            i++
        } else {
            val temp = arr[j]
            for (k in j downTo i + 1) {
                arr[k] = arr[k - 1]
            }
            arr[i] = temp
            i++
            mid++
            j++
        }
    }
}

fun main() {
    val res = mergeSort(intArrayOf(1,467,8,6,34,34,5345,8,6))
    for (num in res) {
        println(num)
    }
    println("-----")
    val res2 = intArrayOf(1,467,8,6,34,34,5345,8,6)
    mergeSortInPlace(res2)
    for (num in res2) {
        println(num)
    }
}

