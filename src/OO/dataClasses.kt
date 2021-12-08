package OO

data class Address(val street: String, val number: Int, val postCode: String, val city: String)

fun main(args: Array<String>) {
    val residence = Address("Main street", 42, "1234", "New York")
    val residence2 = Address("Main street", 42, "1234", "New York")
    // toString()
    println(residence)
    // Referential equality
    println(residence === residence2)
    // Structural equality, equals()
    println(residence == residence2)

    // copy()
    val neighbor = residence.copy(number=123)
    println(neighbor)

    // Destructuring operator
    residence.component1()
    val (street, number, _, city) = residence
    println("$street $number, $city")
}