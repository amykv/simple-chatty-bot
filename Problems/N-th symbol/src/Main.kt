import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val phrase = scanner.nextLine()
    val n = scanner.nextInt()

    println("Symbol # $n of the string \"$phrase\" is \'${phrase[n - 1]}\'")
}