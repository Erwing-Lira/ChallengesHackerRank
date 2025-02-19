package excersises_week_preparation.problem_solving.dataStructures.warmup.easy

/**
 * 5
 * Staircase detail
 *
 * This is a staircase of size n = 4:
 *
 *    #
 *   ##
 *  ###
 * ####
 * Its base and height are both equal to n.
 * It is drawn using # symbols and spaces.
 * The last line is not preceded by any spaces.
 *
 * Write a program that prints a staircase of size .
 */

fun staircase(n: Int): Unit {
    // Write your code here
    for (num in 1..n) {
        val spaces = " ".repeat(n - num)
        val hashtag = "#".repeat(num)

        println(spaces + hashtag)
    }
}

fun main(args: Array<String>) {
    val n = 4

    staircase(n)
}