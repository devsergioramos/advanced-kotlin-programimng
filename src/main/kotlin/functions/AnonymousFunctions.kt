package functions

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main() {
    val result = op(4) { it * it }
    println(result)

    val result2 = op(3, fun(x): Int { return x * x })
    println(result2)
}