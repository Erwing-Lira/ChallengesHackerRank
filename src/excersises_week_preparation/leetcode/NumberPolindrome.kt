package excersises_week_preparation.leetcode

fun main() {
    println(isPalindrome(121))
    println(isPalindrome(-121))
}

fun isPalindrome(x: Int): Boolean {
    val reverseNumber = x.toString().reversed()
    return reverseNumber == x.toString()
}