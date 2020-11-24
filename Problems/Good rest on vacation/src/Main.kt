import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val days = scanner.nextInt()
    val food = scanner.nextInt()
    val flight = scanner.nextInt()
    val hotel = scanner.nextInt()

    val result = (days * food) + (flight * 2) + ((days - 1) * hotel)
    println(result)
}