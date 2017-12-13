package Basics


/*
 * Created by bk on 13-12-2017 15:59
 */
fun main(_z: Array<String>) {
    val s = """Hello world
        |How are you ?
        |I'm able to write in multiple lines haha
    """.trimMargin()
    // trim margin removes the margin and starts new line immediately after |
    // If trim margin is removed then start the line from beginning
    for (i in s) print(i)
    var a = "$s.length is ${s.length}"
    print(a)
}