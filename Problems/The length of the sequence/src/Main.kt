import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var counter = -1

    do {
        counter++
    } while (scanner.nextInt() != 0)

    print(counter)
}