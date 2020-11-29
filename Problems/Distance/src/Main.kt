import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val miles = scanner.nextDouble()
    val hours = scanner.nextDouble()
    val average = miles / hours

    println(average)
}