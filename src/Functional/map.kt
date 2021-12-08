fun main(args: Array<String>) {
    val list = (1..10).toList()
    val doubled = list.map{ element -> element *2 }
    println(doubled)

    val average = list.average()
    val shifted = list.map{ it - average}

    println(shifted)

    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList(),
    )
    val notFlattened = nestedList.map{it.sortedDescending()}
    val flattened = nestedList.flatMap{it.sortedDescending()}

    println(notFlattened)
    println(flattened)

}