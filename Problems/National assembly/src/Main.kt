import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val num = scanner.nextInt()
    val num2 = Math.cbrt(num.toDouble())
    val num3 = num2.toInt()

    println(num3)
}