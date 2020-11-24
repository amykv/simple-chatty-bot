import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextInt()

    val check = num < 10 && num > 0

    println(check)
}