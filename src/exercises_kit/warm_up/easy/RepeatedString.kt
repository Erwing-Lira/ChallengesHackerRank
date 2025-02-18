package exercises_kit.warm_up.easy

/**
 * 4
 * There is a string, s, of lowercase English letters that is
 * repeated infinitely many times. Given an integer, n, find
 * and print the number of letter a's in the first n letters of
 * the infinite string.
 *
 * Example
 * s = "abcac
 * n = 10
 *
 * The substring we consider is abcacabcac, the first 10 characters of
 * the infinite string. There are 4 occurrences of a in the substring.
 */

fun repeatedString(s: String, n: Long): Long {
    val countInText = s.count { it == 'a' }
    val fullRepetitions = n / s.length
    var countA = fullRepetitions * countInText
    val remainder = n % s.length
    if (remainder > 0) {
        countA += s.substring(0, remainder.toInt()).count { it == 'a' }
    }

    return countA
}

fun main() {
    val s = "aba"
    val n: Long = 10
    val result = repeatedString(s, n)

    println(result)
}
