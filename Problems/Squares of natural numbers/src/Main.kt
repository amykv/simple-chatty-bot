import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    fun square(x: Int) = x * x

    val n = scanner.nextInt()
    var x = 1

    while (square(x) <= n) {
        println(square(x))
        x++
    }

}