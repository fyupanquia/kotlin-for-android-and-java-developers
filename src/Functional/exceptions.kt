import java.io.IOException

fun main(args: Array<String>) {
    val input = try {
        getExternalInputErr()
    }catch(e:IOException){
        e.printStackTrace()
        null
    }finally {
        println("Finished trying to read external input")
    }
    println(input)
}

fun getExternalInputErr():String {
    throw IOException("Could not read an external input")
}