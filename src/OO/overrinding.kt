package OO

abstract  class Vehicle(open val brand: String = ""){
    open fun drive(){
        println("Driving")
    }
    abstract fun honk()
}

class Sedan(override var brand: String = "BRAND") : Vehicle(), IDrivable {

    override fun drive() {
        println("gnivirD!")
    }

    override fun honk() {
        println("Moop!")
    }

}

fun main(args: Array<String>) {
    val sedan = Sedan()
    sedan.drive()
    sedan.honk()
}