package exercises_kit.warm_up.easy

/**
 * 1
 * There is a large pile of socks that must be paired by color.
 * Given an array of integers representing the color of each sock,
 * determine how many pairs of socks with matching colors there are.
 *
 * Example
 * n = 9
 * ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
 *
 * There is one pair of color  and one of color . There are
 * three odd socks left, one of each color. The number of
 * pairs is .
 *
 * sock 10 = 2 pairs
 * sock 20 = 1 pair
 * sock 30 = 0 pairs
 * sock 50 = 0 pairs
 *
 * result = 3 pairs
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    val sockList = ar.toSet()
    var pairs = 0

    for (sockType in sockList) {
        var possiblePair = 0
        for (sock in ar) {
            if (sockType == sock) {
                possiblePair++
            }
        }
        pairs += (possiblePair / 2)
    }
    return pairs
}

fun main(args: Array<String>) {
    val n = 9

    val ar = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)

    val result = sockMerchant(n, ar)

    println(result)
}
