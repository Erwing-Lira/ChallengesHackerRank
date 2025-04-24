package excersises_week_preparation.leetcode

fun removeDuplicates(nums: IntArray): Int {
    var index = 1
    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[index] = nums[i]
            index++
        }
    }
    return index
}

fun main() {
    println(removeDuplicates(intArrayOf(0,0,1)))
    println(removeDuplicates(intArrayOf(1,1,2)))
    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
}