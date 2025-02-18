package exercises_kit.warm_up.easy

/**
 * 2
 * An avid hiker keeps meticulous records of their hikes.
 * During the last hike that took exactly X steps, for
 * every step it was noted if it was an uphill, U, or a
 * downhill, D step. Hikes always start and end at sea level,
 * and each step up or down represents a  unit change in
 * altitude. We define the following terms:
 *
 * - A mountain is a sequence of consecutive steps above sea
 * level, starting with a step up from sea level and ending
 * with a step down to sea level.
 * - A valley is a sequence of consecutive steps below sea
 * level, starting with a step down from sea level and
 * ending with a step up to sea level.
 * Given the sequence of up and down steps during a hike,
 * find and print the number of valleys walked through.
 *
 * Example
 * x = 8 paths = "UDDDUDUU"
 *
 *
 * The hiker first enters a valley  units deep. Then they
 * climb out and up onto a mountain  units high. Finally,
 * the hiker returns to sea level and ends the hike.
 *
 * _/\      _
 *    \    /
 *     \/\/
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    val seaLevel = 0
    var valleys = 0
    var altitude = 0

    for (step in path) {
        if (step == 'U') {
            altitude++
        } else {
            altitude--
        }

        if (altitude == seaLevel && step == 'U') {
            valleys++
        }
    }
    return valleys
}

fun main(args: Array<String>) {
    val steps = 8

    val path = "UDDDUDUU"

    val result = countingValleys(steps, path)

    println(result)
}
