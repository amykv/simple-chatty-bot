import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    var max1 = scanner.nextInt()
    if (n == 1) {
        println(max1)
    } else {
        var max2 = scanner.nextInt()
        repeat(n - 2) {
            val v = scanner.nextInt()
            if (v > max1 && v > max2) {
                max2 = max1
                max1 = v
            } else if (v > max1) {
                max1 = v
            } else if (v > max2) {
                max2 = v
            }
        }
        println(max1 * max2)
    }
}