fun sort(a: Array<String>) {
    val n = a.size
    for (i in 1 until n) {
        for (j in i downTo 1) {
            if (a[j - 1].compareTo(a[j]) > 0) {
                exchange(a, j - 1, j)
            } else break
        }
    }
}

fun exchange(a: Array<String>, i: Int, j: Int) {
    val temp = a[i]
    a[i] = a[j]
    a[j] = temp
}

fun main() {
    val array = arrayOf("banana", "apple", "orange", "grape", "kiwi")
    println("Original array: ${array.joinToString()}")

    sort(array)

    println("Sorted array: ${array.joinToString()}")

    // Testing
    val sortedArray = array.sortedArray()
    val expectedArray = arrayOf("apple", "banana", "grape", "kiwi", "orange")
    assert(sortedArray.contentEquals(expectedArray)) { "Sorting failed: Expected ${expectedArray.joinToString()}, got ${sortedArray.joinToString()}" }
    println("Sorting test passed!")
}