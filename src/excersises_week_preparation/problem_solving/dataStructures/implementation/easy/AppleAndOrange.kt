package excersises_week_preparation.problem_solving.dataStructures.implementation.easy

/**
 * 2
 * Sam's house has an apple tree and an orange tree that yield
 * an abundance of fruit. Using the information given below,
 * determine the number of apples and oranges that land on Sam's house.
 *
 * In the diagram below:
 *
 * - The red region denotes the house, where s is the start point, and t
 * is the endpoint. The apple tree is to the left of the house, and
 * the orange tree is to its right.
 * - Assume the trees are located on a single point, where the
 * apple tree is at point , and the orange tree is at point .
 * - When a fruit falls from its tree, it lands  units of distance
 * from its tree of origin along the x-axis. *A negative value of d
 * means the fruit fell d units to the tree's left, and a positive
 * value of d means it falls  units to the tree's right. *
 *
 * Given the value of d for m apples and n oranges, determine how
 * many apples and oranges will fall on Sam's house
 * (i.e., in the inclusive range [s,t])?
 *
 * For example,
 * Sam's house is between s = 7 and T = 10.
 * The apple tree is located at a = 4 and the orange at b = 12.
 * There are m = 3 apples and n = 3 oranges.
 * Apples are thrown apples = [2,3,-4] units distance from a, and
 * oranges = [3,-2,-3] units distance.
 * Adding each apple distance to the position of the tree, they
 * land at [4+2,4+3,4+-4] = [6,7,0].
 * Oranges land at [12+3,12+-2,12+-3] = [15,10,8].
 * One apple and two oranges land in the inclusive range 7 - 10 so we print
 * 1
 * 2
 */
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    // Write your code here
    // apples ----- s -- t ----- oranges
    var appleCount = 0
    var orangeCount = 0
    val houseRange = s..t
    for (num in apples) {
        val res = a + num
        if (houseRange.contains(res)) {
            appleCount++
        }
    }

    for (num in oranges) {
        val res = b + num
        if (houseRange.contains(res)) {
            orangeCount++
        }
    }

    println(appleCount)
    println(orangeCount)
}

fun main(args: Array<String>) {
    // First
    // s start house
    // t end house
    val s = 7
    val t = 10

    // Second
    // apple tree
    // orange tree
    val a = 4
    val b = 12

    // Thrown
    val apples = arrayOf(2,3,-4)
    val oranges = arrayOf(3,-2,-4)

    countApplesAndOranges(s, t, a, b, apples, oranges)
}