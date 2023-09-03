package robocontest

import java.util.*

fun main(args: Array<String>) {
    val s = Scanner(System.`in`)
    var a = s.nextInt()
    if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) print("12/09/")
    else print("13/09/")
    print("%04d".format(a))
}