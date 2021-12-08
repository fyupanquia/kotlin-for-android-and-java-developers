package OO

class Robot (val name: String) {
    fun greetHuman(){
        println("Hello human, my name is $name")
    }
    fun knowsItsName() : Boolean = name.isNotBlank()
}

fun main(args: Array<String>) {
    val figthRobot = Robot("T800")
    if(figthRobot.knowsItsName()){
        figthRobot.greetHuman()
    }
}