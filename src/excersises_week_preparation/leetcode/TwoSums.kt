package excersises_week_preparation.leetcode

fun main() {
    println(twoSum(intArrayOf(1,3,4,5,7), 10).joinToString(" "))
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