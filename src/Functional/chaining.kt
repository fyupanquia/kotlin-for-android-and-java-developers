fun main(args: Array<String>) {
    val inputRows = listOf(
        mapOf("input01.csv" to listOf(3,5,-900,1001,99,2)),
                mapOf("input02.csv" to listOf(1,77,66,-1,0,100)),
                mapOf("input03.csv" to listOf()),
                mapOf("input04.csv" to listOf(66,5,-60,19,999,2222))
    )

    val cleaned = inputRows
            .flatMap { it.values }
            .flatten()
            .filter { it in 0..100 }
            .toIntArray()

    println(cleaned.joinToString())
}