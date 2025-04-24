package excersises_week_preparation.challenge

import kotlin.math.min

fun finMinSync(total_servers: Int, servers: Array<Int>): Int {
    val noRepetitiveServers = servers.toSet().toMutableList()
    val min = noRepetitiveServers.min()
    val max = noRepetitiveServers.max()

    val auxServers = noRepetitiveServers.apply {
        remove(min)
    }
    val minAuxServer = auxServers.min()

    val ascendingWay = max - min
    val descendingWay = min + total_servers - minAuxServer

    return min(ascendingWay, descendingWay)
}

fun main() {
    println(finMinSync(8, arrayOf(2,6,8)))
    println(finMinSync(5, arrayOf(1,5)))
    println(finMinSync(10, arrayOf(4,6,2,9)))
}