package excersises_week_preparation.leetcode

fun removeElement(nums: IntArray, `val`: Int): Int {
    /*var k = 0
    for (i in 0 until nums.size) {
        if (nums[i] != `val`) {
            nums[k] = nums[i]
            k++
        }
    }

    return k*/


    var left = 0
    var right = nums.size - 1
    var size = 0

    while(left <= right) {
        if (nums[left] == `val` && nums[right] == `val`) {
            right--
        } else if (nums[left] == `val` && nums[right] != `val`) {
            val aux = nums[left]
            nums[left] = nums[right]
            nums[right] = aux
            right--
            left++
            size++
        } else if (nums[left] != `val` && nums[right] == `val`) {
            right--
            left++
            size++
        } else {
            left++
            size++
        }
    }
    return size
}

fun main() {
    // println(removeElement(intArrayOf(3,2,2,3), 3)) // 2 -> 2,2,_,_
    println(removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2)) // 5 -> 0,1,4,0,3,_,_,_]
}