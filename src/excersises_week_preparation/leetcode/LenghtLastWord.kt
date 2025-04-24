package excersises_week_preparation.leetcode

fun lengthOfLastWord(s: String): Int {
    val listString = s.trim().split(" ")
    return listString[listString.size - 1].length
}

fun main() {
    println(lengthOfLastWord("Hello World")) //5
    println(lengthOfLastWord("   fly me   to   the moon  ")) //4
    println(lengthOfLastWord("luffy is still joyboy")) //6
}