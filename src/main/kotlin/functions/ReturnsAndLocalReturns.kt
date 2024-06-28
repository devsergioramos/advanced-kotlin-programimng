package functions

inline fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunction() {
    val numbers = 1..100
//    numbers.myForEach {
//        if (it % 5 == 0) {
//            return
//        }
//    }
//    println("Hello")

    numbers.forEach( fun(element) {
        if (element % 5 ==0) {
            return
        }
    } )
    println("Hello")
}

fun main() {
    containingFunction()
}