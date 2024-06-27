package functions

infix fun String.shouldBeEqualTo(value: String) = this == value

fun main() {
    val result = "foo" shouldBeEqualTo "foo"
    println(result)
}