import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextInt()
    var min = scanner.nextInt()

    for (i in 1 until a) {
        val b = scanner.nextInt()

        if (b < min) {
            min = b
        }
    }
    println(min)
}