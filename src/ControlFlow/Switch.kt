package ControlFlow


/*
 * Created by bk on 13-12-2017 16:18
 */

fun main(_z: Array<String>) {
    val a = 1
    when (a) {
        1 -> {
            print(1)
        }
        2 -> {
            print(2)
        }
        3, 4 -> {
            print("3 or 4")
        }
        in 5..10 -> {
            print("In range of 5 to 10")
        }
        !in 5..10 -> {
            print("Not in range")
        }
        else -> {
            print("Nothing matched")
        }
    }
    // When is same as switch in java
    // No break statement is required
    // We can also write conditions in place of 1,2 etc
}