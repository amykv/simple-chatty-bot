import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val list = mutableListOf<Int>()
    while (scanner.hasNextInt()) {
        list.add(scanner.nextInt())
    }
    print("${list.max()} ${list.indexOf(list.max()) + 1}")
}