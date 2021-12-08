import java.io.FileReader

fun main(args: Array<String>) {
    FileReader(".\\src\\map.kt").use{
        val str = it.readText()
        println(str)
    }
}