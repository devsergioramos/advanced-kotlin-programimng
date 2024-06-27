package functions

fun nonOp(x: Int) {

}

inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    throw Exception("Exception")
    println("After calling op()")
}

fun tryingToInline(op: () -> Unit) {
    val reference = op
    println("Assigned value")
    op()
}

fun anotherFunction() {
    operation { println("This is the actual op function") }
}

fun main() {
    operation { println("This is the actual op function") }
}