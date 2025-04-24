package excersises_week_preparation.leetcode

fun isValid(s: String): Boolean {
    val list = mutableListOf<Char>()

    for (char in s) {
        when (char) {
            '(', '[', '{' -> list.add(char)
            ')' -> if (list.isEmpty() || list.last() != '(') return false else list.removeLast()
            ']' -> if (list.isEmpty() || list.last() != '[') return false else list.removeLast()
            '}' -> if (list.isEmpty() || list.last() != '{') return false else list.removeLast()
            else -> return false
        }
    }

    return list.isEmpty()
}

fun main() {
    println(isValid("{}[]()"))
    println(isValid("{[]}"))
    println(isValid("{]}"))
}