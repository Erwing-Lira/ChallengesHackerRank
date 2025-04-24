package excersises_week_preparation.leetcode

fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    var index = 0

    while (left <= right) {
        val mid = (left + right) / 2
        if (nums[mid] == target) {
            return mid
        }
        if (nums[mid] < target) {
            left = mid + 1
            index = mid + 1
        } else {
            right = mid - 1
            index = mid
        }
    }

    return index
}

fun main() {
    println(searchInsert(intArrayOf(1,3,5,6), 5)) //2
    println(searchInsert(intArrayOf(1,3,5,6), 2)) //1
    println(searchInsert(intArrayOf(1,3,5,6), 7)) //4
    println(searchInsert(intArrayOf(1,3,5,6), 0)) //0
}