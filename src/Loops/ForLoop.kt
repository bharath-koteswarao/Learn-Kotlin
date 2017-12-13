package Loops


/*
 * Created by bk on 13-12-2017 16:38
 */

fun main(_z: Array<String>) {
    var arr: IntArray = intArrayOf(1, 2, 3, 3, 4, 5)
    for (i in 0..5) print("${arr[i]} ")
    for (i in arr.indices) print("${arr[i]}")
    for ((i, j) in arr.withIndex()) println("${i} ${j} ")

    var x = 10
    while (x-- > 0) print("$x ")
    loop1@ for (i in 1..100) {
        if (i == 10) break@loop1
    }
}