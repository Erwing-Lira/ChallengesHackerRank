package excersises_week_preparation.demo

fun processLogs(logs: Array<String>, threshold: Int): Array<String> {
    val userTransactionCount = mutableMapOf<String, Long>()

    for (log in logs) {
        val (senderUserId, receptionUserId, _) = log.split(" ")

        if (senderUserId != receptionUserId) {
            userTransactionCount[senderUserId] = userTransactionCount.getOrDefault(senderUserId, 0L) + 1
            userTransactionCount[receptionUserId] = userTransactionCount.getOrDefault(receptionUserId, 0L) + 1
        } else {
            userTransactionCount[senderUserId] = userTransactionCount.getOrDefault(senderUserId, 0L) + 1
        }
    }

    val abusiveUsers = userTransactionCount.filter {
        it.value >= threshold
    }.keys
        .sortedBy {
            it.toLong()
        }

    return abusiveUsers.toTypedArray()
}

fun main(args: Array<String>) {
    /*val logs = arrayOf(
        "1 2 50",
        "1 7 70",
        "1 3 20",
        "2 2 17",
    )*/
    val logs = arrayOf(
        "1 2 1000",
        "3 3 1000",
        "2 1 1000"
    )

    val threshold = 2

    val result = processLogs(logs, threshold)

    println(result.joinToString("\n"))
}