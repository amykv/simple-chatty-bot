import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var maxNumber = 0
    do {
        val number = scanner.nextInt()
        maxNumber = if (number > maxNumber) number else maxNumber
    } while (number != 0)

    println(maxNumber)
}