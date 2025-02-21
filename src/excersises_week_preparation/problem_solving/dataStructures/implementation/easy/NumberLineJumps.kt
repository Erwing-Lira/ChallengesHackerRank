package excersises_week_preparation.problem_solving.dataStructures.implementation.easy

/**
 * 3
 * You are choreographing a circus show with various animals.
 * For one act, you are given two kangaroos on a number line
 * ready to jump in the positive direction (i.e, toward positive infinity).
 *
 * The first kangaroo starts at location x1 and moves at a
 * rate of v1 meters per jump.
 * The second kangaroo starts at location x2 and moves at a
 * rate of v2 meters per jump.
 * You have to figure out a way to get both kangaroos
 * at the same location at the same time as part of the show.
 * If it is possible, return YES, otherwise return NO.
 *
 * Example
 * x1 = 2
 * v1 = 1
 * x2 = 1
 * v2 = 2
 *
 * After one jump, they are both at
 * x = 3, (x1 + v1 = 2 + 1, x2 + v2 = 1 + 2), so the answer is YES.
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // Write your code here
    return if (
        v1 != v2 &&
        (x2 - x1) % (v1 - v2) == 0 &&
        (x2 - x1) / (v1 - v2) > 0
    ) {
        "YES"
    } else {
        "NO"
    }
}

fun main(args: Array<String>) {
    // 0 3 4 2 YES
    // 0 2 5 3 NO
    // 45 7 56 2 NO
    // 21 6 47 3 NO
    // 42 3 94 2 YES
    val x1 = 42
    val v1 = 3

    val x2 = 94
    val v2 = 2
    // 12 = 12
    // YES

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
