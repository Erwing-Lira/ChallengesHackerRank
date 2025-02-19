package excersises_week_preparation.problem_solving.dataStructures.implementation.easy

/**
 * 7
 * HackerLand University has the following grading policy:
 *
 * Every student receives a grade in the inclusive range from 0 to 100.
 * Any grade less than 40 is a failing grade.
 *
 * Sam is a professor at the university and likes to
 * round each student's grade according to these rules:
 *
 * If the difference between the grade and the next multiple of
 * 5 is less than 3, round grade up to the next multiple of 5.
 * If the value of grade is less than 3, no rounding occurs
 * as the result will still be a failing grade.
 *
 * Examples
 *
 * grade = 84 round to 85 (85 - 84 is less than 3)
 * grade = 29 do not round (result is less than 38)
 * grade = 57 do not round (60 - 57 is 3 or higher)
 * Given the initial value of grade for each of Sam's n students,
 * write code to automate the rounding process.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    for (index in grades.indices) {
        val grade = grades[index]
        if (grade < 38) {
            continue
        }

        val nextMultiple = if (grade % 5 == 0) grade else (grade + (5 - grade % 5))
        val rest = nextMultiple - grade
        when {
            rest < 3 -> grades[index] = nextMultiple
            else -> continue
        }
    }

    return grades
}

fun main(args: Array<String>) {
    val grades = arrayOf(4, 73, 67, 38, 33)
    // Result 4, 75, 67, 40, 33

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
