package excersises_week_preparation.challenge

fun isAnagram(str1: String, str2: String): Boolean {
    val str1Array = str1.toCharArray().sortedArray()
    val str2Array = str2.toCharArray().sortedArray()
    return str1Array.contentEquals(str2Array)
}

fun secondCharRepeated(str1: String): Char {
    val countMap = mutableMapOf<Char, Int>()

    for (char in str1) {
        countMap[char] = countMap.getOrDefault(char, 0) + 1
    }

    val nonRepeatedChars = countMap.filter { it.value == 1 }.keys
    return if (nonRepeatedChars.size < 2) {
        '0'
    } else {
        nonRepeatedChars.elementAt(1)
    }
}

/**
 * SELECT e.emp_id, e.emp_name, e.salary +
 * CASE
 * WHEN p.rating = 5 THEN e.salary * 0.20
 * WHEN p.rating = 4 THEN e.salary * 0.10
 * ELSE 0
 * END AS SALARY_WITH_BONUS
 * FROM employees e
 * JOIN performance p ON e.emp_id = p.emp_id
 * ORDER BY salary_with_bonus DESC;
 */

fun main() {
    println(isAnagram("lola", "lalo"))
    println(secondCharRepeated("swiss"))
    println(secondCharRepeated("googlethis"))
    println(secondCharRepeated("anan"))
}