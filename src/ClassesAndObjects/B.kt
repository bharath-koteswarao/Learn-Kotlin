package ClassesAndObjects


/*
 * Created by bk on 13-12-2017 21:41
 */

class Second {
    var b: First = First(10)
}

fun main(_z: Array<String>) {
    val s = Second()
    println(s.b.a)
}