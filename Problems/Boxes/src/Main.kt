import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()

    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()

    val max1 = maxOf(x1, y1, z1)
    val max2 = maxOf(x2, y2, z2)

    val min1 = minOf(x1, y1, z1)
    val min2 = minOf(x2, y2, z2)

    val mul1 = x1 * y1 * z1
    val mul2 = x2 * y2 * z2

    if (max1 > max2 && min1 < min2 || max1 < max2 && min1 > min2) {
        println("Incomparable")
    } else if (mul1 == mul2) {
        println("Box 1 = Box 2")
    } else if (mul1 > mul2) {
        println("Box 1 > Box 2")
    } else if (mul1 < mul2) {
        println("Box 1 < Box 2")
    }
}