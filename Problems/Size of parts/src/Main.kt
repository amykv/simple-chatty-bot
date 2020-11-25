import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val loopNum = scanner.nextInt()
    var rejects = 0
    var fixable = 0
    var correct = 0

    repeat(loopNum) {
        val item = scanner.nextInt()
        if (item == -1) {
            rejects++
        } else if (item == 0) {
            correct++
        } else if (item == 1) {
            fixable++
        } else { println("unknown error")
        }
    }
    print("$correct $fixable $rejects")
}