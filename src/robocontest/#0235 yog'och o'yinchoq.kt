import java.util.*

fun main(args: Array<String>) {
    val s = Scanner(System.`in`)
    var ls:Long
    var lp:Long
    var rs:Long
    var rp:Long
    var p = s.nextLong()
    var q = s.nextLong()
    var a = s.nextLong()
    var b = s.nextLong()
    ls =(a+b)*(a+b)
    lp = (a-b)*(a-b)
    rs =(p+q)*(p+q)
    rp = (p-q)*(p-q)
    var c = a
    var k = p
    if(a<=b) {
        a = b
        b = c
    }
    if(p<=q) {
        p = q
        q = k
    }
    if((p<=a && q<=b) || (p>a && q<=b && ls/rs+lp/rp>=2)) println(a*b-p*q)
    else println(a*b)

}