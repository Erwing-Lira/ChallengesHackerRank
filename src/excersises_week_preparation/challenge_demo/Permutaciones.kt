package excersises_week_preparation.challenge_demo

fun <T> List<T>.simplePermutations(): List<List<T>> {
    if (size <= 1) return listOf(this)

    return flatMapIndexed { _, element ->
        val rest = this - element
        rest.simplePermutations().map {
            listOf(element) + it
        }
    }
}

fun permute(arr: IntArray): MutableList<List<Int>> {
    if (arr.size <= 1) return mutableListOf(arr.toList())

    val resultado = mutableListOf<List<Int>>()

    for (i in arr.indices) {
        val elemento = arr[i]
        val resto = arr.toMutableList().also { it.removeAt(i) }

        val rest = permute(resto.toIntArray())

        for (perm in rest) {
            resultado.add(listOf(elemento) + perm)
        }
    }

    return resultado
}

fun main() {
    val list = listOf(1, 2, 3)
    val permutations = list.simplePermutations()
    permutations.forEach { println(it) }

    println("-----")

    val arr = intArrayOf(1,2,3)
    val res = permute(arr)
    for (num in res) {
        println(num)
    }

}