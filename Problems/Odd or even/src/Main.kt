import java.util.*

fun oddOrEven(a: Int) {
    if (a % 2 == 0) {
        println("EVEN")
    } else {
        println("ODD")
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextInt()
    oddOrEven(a)
}