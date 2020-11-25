import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var total = 0

    repeat(n) {
        val sequence = scanner.nextInt()
        if (sequence > 0) {
            total++
        }
    }

    println(total)

}