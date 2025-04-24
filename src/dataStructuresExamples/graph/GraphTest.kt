package dataStructuresExamples.graph

fun main() {
    val graph = AdjacencyMatrix<String>()

    val singapore = graph.createVertex("Singapore")
    val tokyo = graph.createVertex("Tokyo")
    val hongKong = graph.createVertex("Hong Kong")
    val detroit = graph.createVertex("Detroit")
    val sanFrancisco = graph.createVertex("San Francisco")
    val washingtonDC = graph.createVertex("Washington DC")
    val austinTexas = graph.createVertex("Austin Texas")
    val seattle = graph.createVertex("Seattle")

    graph.add(EdgeType.UNIDIRECTED, singapore, hongKong, 300.00)
    graph.add(EdgeType.UNIDIRECTED, singapore, tokyo, 500.00)
    graph.add(EdgeType.UNIDIRECTED, hongKong, tokyo, 250.00)
    graph.add(EdgeType.UNIDIRECTED, tokyo, detroit, 450.00)
    graph.add(EdgeType.UNIDIRECTED, tokyo, washingtonDC, 300.00)
    graph.add(EdgeType.UNIDIRECTED, hongKong, sanFrancisco, 600.00)
    graph.add(EdgeType.UNIDIRECTED, detroit, austinTexas, 50.00)
    graph.add(EdgeType.UNIDIRECTED, austinTexas, washingtonDC, 292.00)
    graph.add(EdgeType.UNIDIRECTED, sanFrancisco, washingtonDC, 337.00)
    graph.add(EdgeType.UNIDIRECTED, washingtonDC, seattle, 277.00)
    graph.add(EdgeType.UNIDIRECTED, sanFrancisco, seattle, 218.00)
    graph.add(EdgeType.UNIDIRECTED, austinTexas, sanFrancisco, 297.00)

    println(graph)

    println(graph.weight(singapore, tokyo))

    println("San Franciso")
    graph.edges(sanFrancisco).forEach {
        println("from: ${it.source.data} to: ${it.destination.data}")
    }
}