package excersises_week_preparation.leetcode

fun main() {
    println(isPalindrome(121))
    println(isPalindrome(-121))
    println(isPalindrome(123))
    println(isPalindrome(1221))
    println(isPalindrome(1231))
}

fun isPalindrome(x: Int): Boolean {
    var l = 0
    var r = x.toString().length - 1

    while (l < r) {
        if (x.toString()[l] != x.toString()[r]) {
            return false
        }
        l++
        r--
    }
    return true
}

/*fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    var res = 0
    var aux = x

    while (aux != 0) {
        val lastValue = aux % 10
        res = res * 10 + lastValue
        aux /= 10
    }

    return res == x
}*/

/*fun isPalindrome(x: Int): Boolean {
    val reverseNumber = x.toString().reversed()
    return reverseNumber == x.toString()
}*/