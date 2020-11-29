import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextDouble()
    val result = num.pow(3) + num.pow(2) + num + 1

    println(result)
}