package OO

interface IDrivable {
    fun drive()
}

class Bicycle : IDrivable {
    override fun drive() {
        println("driving a bicycle")
    }
}

open class Boat: IDrivable{
    override fun drive() {
        println("driving a boat")
    }
}


fun main(args: Array<String>) {
    val drivable : IDrivable = Bicycle()
    drivable.drive()
}
