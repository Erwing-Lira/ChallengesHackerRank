package excersises_week_preparation.challenge

// To execute Kotlin code, please define a top level function named main

fun main() {
    /*val intervals = arrayOf(
      intArrayOf(1,4),
      intArrayOf(4,5)
    )*/ // [[1,5]]
    /*val intervals = arrayOf(
      intArrayOf(1,3),
      intArrayOf(2,6),
      intArrayOf(8,10),
      intArrayOf(15,18)
    )*/ // [[1,6],[8,10],[15,18]]
    /*val intervals = arrayOf(
        intArrayOf(2,4),
        intArrayOf(8,12),
        intArrayOf(3,7),
        intArrayOf(11,18)
    )*/ // [[2,7],[8,18]]
    val intervals = arrayOf(
        intArrayOf(2,4),
        intArrayOf(8,12),
        intArrayOf(3,7),
        intArrayOf(11,18),
        intArrayOf(5,3),
    ) // [[2,7],[8,18]]
    val res = mergeIntervals(intervals)
    for (element in res.indices) {
        println("[")
        for (range in res[element]) {
            println("[$range]")
        }
        println("]")
    }
}

fun mergeIntervals(intervals: Array<IntArray>): Array<IntArray> {
    if (intervals.isEmpty()) return arrayOf()

    intervals.sortBy { it[0] }

    var res = mutableListOf<IntArray>()
    var currentInterval = intervals[0]

    for (i in 1 until intervals.size) {
        val nextInterval = intervals[i]

        if (currentInterval[1] >= nextInterval[0]) {
            currentInterval[1] = maxOf(currentInterval[1], nextInterval[1])
        } else {
            res.add(currentInterval)
            currentInterval = nextInterval
        }
    }
    res.add(currentInterval)

    return res.toTypedArray()
}


// Your previous Plain Text content is preserved below:

// Example 1:

/*
[1, 2, 3]
  [ 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6] = [1, 6]


 */

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

// Example 2:
// Input: intervals = [[2,4], [8,12], [3,7] ,[11,18]]
// Output: [[2,7],[8,18]]
// Explanation: Since intervals [2,4] and [3,7] overlap, merge them into [2,7]. Since intervals [8,12] and [11,18] overlap, merge them into [8,18].

// Example 3:
// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.