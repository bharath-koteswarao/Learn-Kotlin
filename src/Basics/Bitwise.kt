package Basics


/*
 * Created by bk on 12-12-2017 17:04
 */

fun main(z: Array<String>) {
    var a = 100
    var b = 10
    // Declaring a and b in same line is not possible in kotlin
    println("${a or b} ${a shr 1} ${a shl 1} ${a and b} ${a xor b}")
    val x = true
    val y = false
    print("${x && y == x and y}")
    // Both "and" and && can be used to check expressions
}