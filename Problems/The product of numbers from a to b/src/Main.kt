import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    var result: Long = 1

    for (i in a until b) {
        result *= i
    }
    println(result)
}