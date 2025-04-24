package dataStructures.order

fun main() {
    val arr = mutableListOf(5,3,8,2,1,0)
    bubble(arr)
    for (num in arr) {
        println(num)
    }
}

fun bubble(arr: MutableList<Int>) {
    val size = arr.size - 1
    for (i in 0 until size) {
        for (j in 0 until size - i) {
            if (arr[j] > arr[j + 1]) {
                val aux = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = aux
            }
        }
    }
}