package excersises_week_preparation.leetcode

fun strStr(haystack: String, needle: String): Int {
    // return haystack.indexOf(needle)

    if (haystack.length < needle.length){
        return -1
    }
    for (i in 0..haystack.length - needle.length) {
        if (haystack.substring(i, i + needle.length) == needle) {
            return i
        }
    }
    return -1
}

fun main() {
    println(strStr("sadbutsad", "sad"))
    println(strStr("leetcode", "leeto"))
}