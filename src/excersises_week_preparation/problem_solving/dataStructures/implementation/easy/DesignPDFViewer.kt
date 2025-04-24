package excersises_week_preparation.problem_solving.dataStructures.implementation.easy

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    // Write your code here
    val alphabet = 'a'..'z'

    val heightMap = alphabet.zip(h)
    var maxHeight = 0
    for (char in word) {
        val height = heightMap.first { it.first == char }.second
        maxHeight = maxOf(height, maxHeight)
    }
    return word.length * maxHeight
}

fun main() {
    val h = arrayOf(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7)
    println(designerPdfViewer(h, "zaba"))
}