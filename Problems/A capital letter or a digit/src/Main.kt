import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val ch = scanner.next().first()

    val check = ch.isUpperCase() || ch in '\u0031'..'\u0039'

    println(check)
}