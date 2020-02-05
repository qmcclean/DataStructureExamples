package basics

fun main(args: Array<String>) {

    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )

    val flatten = data.flatMap { it.value }

    val filteredList = flatten.filter { e -> e > 0  }

    val average = filteredList.average()

    // better way to do the above
    val cleaned = data.flatMap { it.value }
        .filter { it > 0 }

    println(cleaned)

    val badValues = flatten.filter { e -> e < 0 }
    println(badValues)

    // 2) Files with faulty data
    val faultyFiles = data.filter { it.value.any { it < 0 } }
        .map { it.key }

    // 3) Number of faulty entries
    val numberOfFaults = data.flatMap { it.value }
        .filter { it < 0 }
        .count()


    println("Files with faulty data: $faultyFiles")
    println("There were $numberOfFaults errors in the data.")

    val seq = generateSequence ( 1, { it + 1})
}


