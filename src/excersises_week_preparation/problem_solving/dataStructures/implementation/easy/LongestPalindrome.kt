package excersises_week_preparation.problem_solving.dataStructures.implementation.easy

fun longestPalindrome(s: String): String {
    if (s.isEmpty()) return ""

    var start = 0
    var end = 0

    for (i in s.indices) {
        val lenI = expandFromCenter(s, i, i)
        val lenP = expandFromCenter(s, i, i + 1)
        val len = maxOf(lenI, lenP)

        if (len > end - start) {
            start = i - (len - 1) / 2
            end = i + len / 2
        }
    }
    return s.substring(start, end + 1)
}

private fun expandFromCenter(s: String, left: Int, right: Int): Int {
    var l = left
    var r = right

    while (l >= 0 && r < s.length && s[l] == s[r]) {
        l--
        r++
    }
    return r - l - 1
}

fun main() {
    println(longestPalindrome("babad")) // "bab" o "aba"
    println(longestPalindrome("cbbd"))  // "bb"
}