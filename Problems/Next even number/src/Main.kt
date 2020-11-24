import java.util.Scanner

fun main(args: Array<String>) {
    val num = readLine()!!.toInt()
    print(num + 2 - num % 2)
}