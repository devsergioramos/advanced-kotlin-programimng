package functions

fun factorial(number: Int): Int {
    when (number) {
        0, 1 -> return 1
        else -> return number * factorial(number - 1)
    }
}

tailrec fun factorialTR(number: Int, accumulator: Int = 1): Int {
    when (number) {
        0 -> return accumulator
        else -> return factorialTR(number - 1, number * accumulator)
    }
}

fun main() {
    val number = 5
    val result = factorial(number)
    println("1 - Factorial of $number = $result")

    val result2 = factorialTR(number)
    println("2 - Factorial of $number = $result2")
}