import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var total = 0

    do {
        val number = scanner.nextInt()
         if (number > 0) total += number
    } while (number != 0)

    println(total)
}