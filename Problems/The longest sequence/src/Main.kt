import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    var max = 1
    var temp = 1
    val firstNum = scanner.nextInt()
    var tempNum = firstNum

    for (i in 1 until n) {
        val number = scanner.nextInt()
        if (number >= tempNum) {
            temp++
            tempNum = number
        } else {
            if (max <= temp) max = temp
            temp = 1
            tempNum = number
        }
        if (max <= temp) max = temp
    }

    println(max)
}