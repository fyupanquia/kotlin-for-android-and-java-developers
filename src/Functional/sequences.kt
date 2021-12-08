import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val veryLongList = (1..9999999L).toList()
    val sum = veryLongList
        //.asSequence()
        .filter { it > 50 }
        .map{ it * 2}
        .take(10)
        .sum()

    val seq = generateSequence (1, { it+1 })

    println(sum)
    println(seq.take(10).toList())


    val nonLazySum : Long
    val lazySum: Long

    val msNonLazy = measureTimeMillis {
        nonLazySum = veryLongList
            .filter { it > 50 }
            .map{ it * 2}
            .map{ it /3}
            .map{ it + 25}
            .take(1000)
            .sum()
    }

    val msLazy = measureTimeMillis {
        lazySum = veryLongList
            .asSequence()
            .filter { it > 50 }
            .map{ it * 2}
            .map{ it /3}
            .map{ it + 25}
            .take(1000)
            .sum()
    }


    println("Non-Lazy $msNonLazy ms, Result $nonLazySum")
    println("Lazy $msLazy ms, Result $lazySum")
}
