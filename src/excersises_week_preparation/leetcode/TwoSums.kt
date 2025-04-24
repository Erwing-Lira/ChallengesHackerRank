package excersises_week_preparation.leetcode

fun main() {
    println(twoSum(intArrayOf(1,3,4,5,7), 10).joinToString(" "))
    println(twoSumTwo(intArrayOf(1,3,4,5,7), 10).joinToString(" "))
}

fun twoSumTwo(nums: IntArray, target: Int): IntArray {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val sum = nums[left] + nums[right]

        when {
            sum == target -> {
                return intArrayOf(
                    left,
                    right
                )
            }
            sum > target -> {
                right--
            }
            else -> {
                left++
            }
        }
    }

    return intArrayOf()
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        val rest = target - nums[i]
        if (map.containsKey(rest)) {
            return intArrayOf(
                map.getOrDefault(rest, 0),
                i
            )
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}