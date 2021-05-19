package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length}")

    var str2: String? = "Hello Kotlin"
    str2 = null
    var len = if (str2 != null) str2.length else -1
    println("str2: $str2 length: $len")

    var str3: String? = "Hello Kotlin"
    str3 = null
    println("str3: $str3 length: ${str3?.length ?: -1}")

    val a: Int = 1
    val b: Double = a.toDouble()

    val result = 1L + 3 // Long으로 자동형변환

    val a1: Int = 128
    val b1: Int = 128
    println(a1 == b1)
    println(a1 === b1)

    val a2: Int = 128
    val b2: Int? = 128
    println(a2 == b2)
    println(a2 === b2)

}