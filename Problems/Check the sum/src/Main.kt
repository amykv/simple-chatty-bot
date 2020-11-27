import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    if (a + b == 20 || a + c == 20 || b + c == 20) {
        println("true")
    } else {
        println("false")
    }
}