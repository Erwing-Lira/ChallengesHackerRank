package excersises_week_preparation.problem_solving.dataStructures.warmup.easy

import java.text.SimpleDateFormat
import java.util.Locale

/**
 * 3
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 * Example
 * s = '12:01:00PM'
 * Return '12:01:00'.
 *
 * s = '12:01:00AM'
 * Return '00:01:00'.
 *
 * Function Description
 *
 * Complete the timeConversion function in the editor below.
 * It should return a new string representing the input time in 24 hour format.
 *
 * timeConversion has the following parameter(s):
 *
 * string s: a time in 12 hour format
 * Returns
 *
 * string: the time in 24 hour format
 * Input Format
 *
 * A single string s that represents a time in 12-hour clock
 * format (i.e.: hh:mm:ssAM or hh:mm:ssPM).
 *
 * Constraints
 *
 * All input times are valid
 * Sample Input
 *
 * 07:05:45PM
 * Sample Output
 *
 * 19:05:45
 */

fun timeConversion(s: String): String {
    // Write your code here
    val formatterInput = SimpleDateFormat("hh:mm:ssa", Locale.getDefault())
    val formatterOutput = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

    val date = formatterInput.parse(s)
    val formattedTime = formatterOutput.format(date)
    return formattedTime
}

fun main(args: Array<String>) {
    val s = "07:05:45PM"

    val result = timeConversion(s)

    println(result)
}
