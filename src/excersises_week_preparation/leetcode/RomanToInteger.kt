package excersises_week_preparation.leetcode

fun main() {
    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
    println(romanToInt("XL"))
}

fun romanToInt(s: String): Int {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var res = 0
    for (i in s.indices) {
        val value = map.getOrDefault(s[i], 0)
        res += if (i > 0 && value > map.getOrDefault(s[i - 1], 0)) {
            value - 2 * map.getOrDefault(s[i - 1], 0)
        } else {
            value
        }
    }
    return res
}