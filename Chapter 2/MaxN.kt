fun maxN(numbers: IntArray): Int {
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}

fun main() {
    val array = intArrayOf(10, 5, 20, 15, 8)
    println("The maximum element in the array is: ${maxN(array)}")
}