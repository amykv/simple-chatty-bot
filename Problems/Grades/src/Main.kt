import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0

    repeat(n) {
        val mark = scanner.nextInt()
        if (mark == 2) {
            d++
        } else if (mark == 3) {
            c++
        } else if (mark == 4) {
            b++
        } else if (mark == 5) {
            a++
        }
    }

    println("$d $c $b $a")
}