
inline fun modifyString(str:String, operation: (String) -> String) : String {
    return operation(str)
}
fun main(args: Array<String>) {
    val message = modifyString("i'm  frank", {it.toUpperCase()})
    println(message)
}