package excersises_week_preparation.challenge

fun main() {
    val str = "hello"
    println(reverseString(str))
    println(reverseStringTwo(str))
}

fun reverseString(input: String): String {
    return input.toCharArray().reversedArray().joinToString("")
}

fun reverseStringTwo(input: String): String {
    val result = StringBuilder()
    for (i in input.length - 1 downTo 0) {
        result.append(input[i])
    }
    return result.toString()
}