package excersises_week_preparation.demo

fun dfs(graph: Array<List<Int>>, node: Int, visited: BooleanArray) {
    // Marca el nodo actual como visitado
    visited[node] = true
    println("Visitando nodo: $node")

    // Visita todos los nodos vecinos no visitados
    for (neighbor in graph[node]) {
        if (!visited[neighbor]) {
            dfs(graph, neighbor, visited)  // Llamada recursiva para visitar al vecino
        }
    }
}

fun main() {
    // Ejemplo de un grafo representado por listas de adyacencia
    val graph = arrayOf(
        listOf(1, 2),    // Nodo 0 está conectado con los nodos 1 y 2
        listOf(0, 3, 4), // Nodo 1 está conectado con los nodos 0, 3 y 4
        listOf(0),       // Nodo 2 está conectado solo con el nodo 0
        listOf(1),       // Nodo 3 está conectado solo con el nodo 1
        listOf(1)        // Nodo 4 está conectado solo con el nodo 1
    )

    /**
     *
     *    0
     *  |  |
     *  1   2
     * | |
     * 3 4
     *
     */

    val visited = BooleanArray(graph.size) { false }  // Arreglo para marcar los nodos visitados
    dfs(graph, 0, visited)  // Comienza la búsqueda desde el nodo 0
}
