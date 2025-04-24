package excersises_week_preparation.leetcode

fun longestCommonPrefix(strs: Array<String>): String {
    var firstElement = strs[0]

    for(i in 1 until strs.size){
        if (firstElement.isEmpty()) return firstElement
        while (!strs[i].startsWith(firstElement)) {
            firstElement = firstElement.substring(0, firstElement.length - 1)
        }
        /*while(strs[i].indexOf(firstElement) != 0){
            firstElement = firstElement.substring(0, firstElement.length - 1)
        }*/
    }
    return firstElement
}

fun main() {
    // println(longestCommonPrefix(arrayOf("flower","flow","flight")))
    // println(longestCommonPrefix(arrayOf("fut","flow","stadium")))
    println(longestCommonPrefix(arrayOf("fut","stadium","flow")))
}