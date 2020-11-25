import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    var temp = Int.MIN_VALUE
    var result = ""

    for (i in 1..n) {
        val num = scanner.nextInt()
        result = if (temp < num) "YES" else "NO"
        temp = num
        if (result == "NO") {
            break
        }
    }

    println(result)
}