package excersises_week_preparation.demo

import java.util.*

fun bfs(graph: Array<List<Int>>, start: Int) {
    val visited = BooleanArray(graph.size) { false }  // Marcador de nodos visitados
    val queue: Queue<Int> = LinkedList()  // Cola para BFS

    // Empezamos desde el nodo de inicio
    visited[start] = true
    queue.add(start)

    while (queue.isNotEmpty()) {
        val node = queue.poll()  // Sacamos el primer nodo de la cola
        println("Visitando nodo: $node")

        // Agregamos todos los vecinos no visitados del nodo
        for (neighbor in graph[node]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true
                queue.add(neighbor)
            }
        }
    }
}

fun main() {
    // Ejemplo de grafo representado como lista de adyacencia
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
     *  |   |
     *  1    2
     * | |
     * 3 4
     *
     */

    bfs(graph, 0)  // Comienza la búsqueda desde el nodo 0
}
