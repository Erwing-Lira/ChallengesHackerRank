package excersises_week_preparation.problem_solving.dataStructures.implementation.easy

// n = 4
// X X X X
// X     X
// X     X
// X X X X
fun makeSquare(n: Int) {
    if (n <= 2) return
    for (i in 0..n - 1) {
        for (j in 0..n - 1) {
            if (
                i == 0 || i == n -1 ||
                j == 0 || j == n -1
            ) {
                print("X ")
            } else {
                print("  ")
            }
        }
        println()
    }
}

fun main() {
    println(makeSquare(10))
}