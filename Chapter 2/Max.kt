fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun main() {
    val num_One = 10
    val num_Two = 20
    println("The maximum between $num_One and $num_Two is: ${max(num_One, num_Two)}")
}