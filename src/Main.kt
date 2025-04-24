fun main() {
    val res = combinationSum(
        intArrayOf(2,3,6,7),
        7
    )
    for (num in res) {
        println(num)
    }
}

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    fun backtrack(remaining: Int, start: Int, current: MutableList<Int>) {
        if (remaining == 0) {
            result.add(ArrayList(current))
            return
        }

        for (i in start until candidates.size) {
            val num = candidates[i]

            if (num <= remaining) {
                current.add(num)
                backtrack(remaining - num, i, current)
                current.removeAt(current.size - 1)
            }
        }
    }

    backtrack(target, 0, mutableListOf())
    return result
}