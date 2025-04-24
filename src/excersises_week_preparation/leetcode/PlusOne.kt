package excersises_week_preparation.leetcode

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.indices.reversed()) {
        digits[i] += 1

        if (digits[i] <= 9) {
            return digits
        }
        digits[i] = 0
    }

    val arr = IntArray(digits.size + 1)
    arr[0] = 1

    return arr
}

fun main() {
    println(plusOne(intArrayOf(1,9)))
    println(plusOne(intArrayOf(1,2,3)))
    println(plusOne(intArrayOf(4,3,2,1)))
    println(plusOne(intArrayOf(9)))
    println(plusOne(intArrayOf(8,9,9,9)))
}