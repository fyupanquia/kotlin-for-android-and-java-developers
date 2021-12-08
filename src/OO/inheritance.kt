package OO

open class Base
class Child : Base()

open class Shape(val name:String){
    open fun area() = 0.0
}

class Circle (name: String, val radius:Double) : Shape(name){
    override fun area() = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {
    val smallcircle = Circle("Small Circle", 2.0)

    println(smallcircle.name)
    println(smallcircle.radius)
    println(smallcircle.area())
}