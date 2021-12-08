package OO

abstract class AShape(val name: String){
    abstract fun area(): Double
}

class ACircle(name: String, val radius: Double) : AShape(name){
    override fun area()= Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {
    val largecircle = ACircle("Large Circle",17.0)
    println(largecircle.area())
}