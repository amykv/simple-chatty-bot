package bot

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    val ar1 = scanner.nextInt()
    val ar2 = scanner.nextInt()
    val ar3 = scanner.nextInt()

    val yourAge = (ar1 * 70 + ar2 * 21 + ar3 * 15) % 105

    println("Your age is {$yourAge}; that's a good time to start programming!")
}
