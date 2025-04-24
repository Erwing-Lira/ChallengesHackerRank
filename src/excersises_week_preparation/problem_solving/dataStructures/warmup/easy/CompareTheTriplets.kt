package excersises_week_preparation.problem_solving.dataStructures.warmup.easy

/**
 * 3
 * Alice and Bob each created one problem for HackerRank.
 * A reviewer rates the two challenges, awarding points on
 * a scale from 1 to 100 for three categories: problem clarity,
 * originality, and difficulty.
 *
 * The rating for Alice's challenge is the triplet
 * a = (a[0], a[1], a[2]),
 * and the rating for Bob's challenge is the triplet
 * b = (b[0], b[1], b[2]).
 *
 * The task is to calculate their comparison points
 * by comparing each category:
 *
 * If a[i] > b[i], then Alice is awarded 1 point.
 * If a[i] < b[i], then Bob is awarded 1 point.
 * If a[i] = b[i], then neither person receives a point.
 *
 * Example
 *
 * a = [1, 2, 3]
 * b = [3, 2, 1]
 *
 * For elements *0*, Bob is awarded a point because a[0] < b[0].
 * For the equal elements a[1] and b[1], no points are earned.
 * Finally, for elements 2, a[2] > b[2] so Alice receives a point.
 * The return array is [1, 1] with Alice's score first and Bob's second.
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val arrayRes = Array(2) { 0 }
    for (index in a.indices) {
        when {
            a[index] > b[index] -> arrayRes[0]++
            a[index] == b[index] -> continue
            a[index] < b[index] -> arrayRes[1]++
        }
    }

    return arrayRes
}

fun main(args: Array<String>) {
    val a = arrayOf(1,2,3)
    val b = arrayOf(3,2,1)
    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}