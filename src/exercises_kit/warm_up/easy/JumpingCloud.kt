package exercises_kit.warm_up.easy

/**
 * 3
 * There is a new mobile game that starts with consecutively
 * numbered clouds. Some of the clouds are thunderheads and
 * others are cumulus. The player can jump on any cumulus
 * cloud having a number that is equal to the number of the
 * current cloud plus 1 or 2. The player must avoid the thunderheads.
 * Determine the minimum number of jumps it will take to jump
 * from the starting postion to the last cloud. It is always
 * possible to win the game.
 *
 * For each game, you will get an array of clouds numbered 0 if
 * they are safe or 1 if they must be avoided.
 *
 * Example
 * c = [0,1,0,0,0,1,0]
 *
 * Index the array from 0..6. The number on each cloud is its
 * index in the list so the player must avoid the clouds at
 * indices 1 and 5. They could follow these two paths:
 * 0 -> 2 -> 4 -> 6 or 0 -> 2 -> 3 -> 4 -> 6.
 * The first path takes 3 jumps while the second takes 4. Return 3.
 */


fun jumpingOnClouds(c: Array<Int>): Int {
    // Write your code here
    var jumps = 0
    val size = c.size
    var position = 0

    for (cloud in c.indices) {
        if (position >= size - 1) break
        position = if (position + 2 < size && c[position + 2] == 0) {
            position + 2
        } else {
            position + 1
        }
        jumps++
    }
    return jumps
}

fun main(args: Array<String>) {
    val n = 7

    val c = arrayOf(0, 0, 1, 0, 0, 1, 0)

    val result = jumpingOnClouds(c)

    println(result)
}

