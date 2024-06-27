package functions

fun foo(fooParam: String) {
    val outerFunction = "Value"
    fun bar(barParam: String) {
        println(barParam)
        println(fooParam)
        println(outerFunction)
    }
    bar("barParam")
}

fun main() {
    foo("fooParam")
}