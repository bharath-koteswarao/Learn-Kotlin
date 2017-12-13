package Basics


/*
 * Created by bk on 13-12-2017 15:46
 */

fun main(_z: Array<String>) {
    val arr: IntArray = intArrayOf(1, 2, 3, 4, 5)
    arr[0] = arr[1] + arr[2]
    print(arr[0])
    for (i in arr) print("$i ")
}