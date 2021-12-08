package OO

fun Int.isEven() = (this%2==0)
fun City.isLarge() = population>1_000_000

fun main(args: Array<String>) {
    println(5.isEven())

    val naturals = listOf(2,3,4,5,6,7,8,9)
    println(naturals.filter { it.isEven() })
    
    val austin = City()
    austin.name = "Austin"
    austin.population = 950_000
    println(austin.isLarge())
}