import java.util.Scanner
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val group1 = Math.round(scanner.nextInt().toDouble() / 2)
    val group2 = Math.round(scanner.nextInt().toDouble() / 2)
    val group3 = Math.round(scanner.nextInt().toDouble() / 2)

    println(group1 + group2 + group3)
}