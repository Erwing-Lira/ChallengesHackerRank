/**
 * 3
 * It is New Year's Day and people are in line for the Wonderland
 * rollercoaster ride. Each person wears a sticker indicating
 * their initial position in the queue from 1 to n. Any person
 * can bribe the person directly in front of them to swap positions,
 * but they still wear their original sticker. One person can bribe at most two others.
 *
 * Determine the minimum number of bribes that took place to get
 * to a given queue order. Print the number of bribes, or, if
 * anyone has bribed more than two people, print Too chaotic.
 *
 * Example
 * q = [1,2,3,5,4,6,7,8]
 *
 * If person 5 bribes person 4, the queue will look like this:
 * [1,2,3,5,4,6,7,8]
 * . Only 1 bribe is required. Print 1.
 *
 * q = [4,1,2,3]
 * Person 4 had to bribe 3 people to get to the current position. Print Too chaotic.
 */

fun minimumBribes(q: Array<Int>): Unit {
    // Write your code here
    var bribes = 0

    for (i in q.indices) {
        // Verificamos si una persona se ha movido más de dos posiciones hacia adelante
        if (q[i] - (i + 1) > 2) {
            println("Too chaotic")
            return
        }

        // Contamos los sobornos (personas con números más pequeños que pasaron adelante)
        // Obtiene el numero maximo entre 0 o q[i] - 2 para asegurarse de que no sea negativos
        // -2 por que no puede moverse mas de dos veces a la izquierda
        for (j in 0.coerceAtLeast(q[i] - 2) until i) {
            if (q[j] > q[i]) {
                // Si la persona con el número más grande está delante, cuenta como un soborno
                bribes++
            }
        }
    }

    println(bribes)
}

fun main(args: Array<String>) {
    val t = 2

    for (tItr in 1..t) {
        val n = 5
        val q = if (tItr == 1) {
            // arrayOf(2, 1, 5, 3, 4)
            arrayOf(1,2,5,3,7,8,6,4)
        } else {
            arrayOf(2, 5, 1, 3, 4)
        }

        minimumBribes(q)
    }
}