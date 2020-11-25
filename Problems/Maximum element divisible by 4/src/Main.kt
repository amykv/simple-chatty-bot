import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var max = 0

    repeat(n) {
        val input = scanner.nextInt()
        if (input % 4 == 0 && input > max) {
            max = input
        }
    }

    println(max)
}