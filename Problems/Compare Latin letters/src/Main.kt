import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val ch1 = scanner.next().first()
    val ch2 = scanner.next().last()

    val isSame = ch1.toUpperCase() == ch2.toUpperCase() || ch1.toLowerCase() == ch2.toLowerCase()
    println(isSame)
}