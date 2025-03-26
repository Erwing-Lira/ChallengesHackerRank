package excersises_week_preparation.problem_solving.dataStructures.implementation.easy

/**
 * Given an array of bird sightings where every element
 * represents a bird type id, determine the id of the most
 * frequently sighted type. If more than 1 type has been
 * spotted that maximum amount, return the smallest of their ids.
 *
 * Example
 * arr = [1,1,2,2,3]
 *
 * There are two each of types 1 and 2, and one sighting of
 * type 3. Pick the lower of the two types seen twice: type 1.
 */

fun migratoryBirds(arr: Array<Int>): Int {
    // Write your code here
    /**
     * val res = arr.groupBy { it }.maxBy { it.value.size }
     * return res.key
     */
    val arrCounted = arr
        .groupingBy { it }
        .eachCount()
    val maxValue = arrCounted.maxOf { it.value }
    val res = arrCounted
        .filter { it.value == maxValue }
        .keys
        .minBy { it }
    return res
}

fun main() {
    val arr = arrayOf(1,1,2,2,3)
    // val arr = arrayOf(1,4,4,4,5,3)

    val res = migratoryBirds(arr)

    println(res)
}