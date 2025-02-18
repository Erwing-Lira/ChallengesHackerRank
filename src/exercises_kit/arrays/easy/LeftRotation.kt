package exercises_kit.arrays.easy

/**
 * 2
 * A left rotation operation on an array shifts each of the
 * array's elements 1 unit to the left. For example, if 2
 * left rotations are performed on array [1,2,3,4,5],
 * then the array would become [3,4,5,1,2]. Note that the
 * lowest index item moves to the highest index in a rotation.
 * This is called a circular array.
 *
 * Given an array a of n integers and a number, d, perform d
 * left rotations on the array. Return the updated array
 * to be printed as a single line of space-separated integers.
 *
 * Example
 * 5 4
 * 1 2 3 4 5
 *
 * Output
 * 5 1 2 3 4
 *
 * Explanation
 * When we perform d = 4 left rotations, the array undergoes
 * the following sequence of changes:
 *
 * [1,2,3,4,5]
 * [2,3,4,5,1] -> 1
 * [3,4,5,1,2] -> 2
 * [4,5,1,2,3] -> 3
 * [5,1,2,3,4] -> 4
 *
 */

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    // Write your code here
    val listNumbers = a.toMutableList()
    for (i in 1..d) {
        listNumbers.add(listNumbers[0])
        listNumbers.removeAt(0)
    }
    return listNumbers.toTypedArray()
}

fun main(args: Array<String>) {
    val n = 5
    val d = 4
    val a = arrayOf(1,2,3,4,5)
    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}