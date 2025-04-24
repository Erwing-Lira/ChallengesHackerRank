package excersises_week_preparation.challenge_demo

/**
 * Buscar cuantos grupos se puede formar, recordar que en a matriz donde
 * la fila y la columna es la misma, se auto regalo un disco en otro caso
 * le regalo un disco a la otra persona
 */
fun countGroups(related: Array<String>): Int {
    val relatedSize = related.size
    val visited = BooleanArray(relatedSize) { false }
    var groupCount = 0

    fun dfs(i: Int) {
        visited[i] = true
        for (j in 0..<relatedSize) {
            if (related[i][j] == '1' && !visited[j]) {
                dfs(j)
            }
        }
    }

    for (i in 0..<relatedSize) {
        if (!visited[i]) {
            groupCount++
            dfs(i)
        }
    }

    return groupCount
}

fun main(args: Array<String>) {
    val related = arrayOf(
        "1100",
        "1110",
        "0110",
        "0001"
    )

    val result = countGroups(related)

    println(result)
}
