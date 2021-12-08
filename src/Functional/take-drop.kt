fun main(args: Array<String>) {
    val list = (1..1000).toList()
    var first10 = list.take(10)
    var withoutFirst900 = list.drop(900)

    println(first10)
    println(withoutFirst900)

    val list2 = generateSequence (0){
        println("getting ${it +10}")
        it +10
    }

    val first = list2.first()
    //val last = list2.last() // infinity callback
     first10 = list2.take(10).toList()
    var first20 = list2.take(20).toList()


    println(first)
    println(first10)
    println(first20)

}
