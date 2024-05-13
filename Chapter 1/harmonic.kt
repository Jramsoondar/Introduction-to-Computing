//Ex 3: reimplement Harmonic sequence
// ( please refer to page 65 of our textbook).
// The number of elements of the sequence should come from the user input.
fun main(args: Array<String>)
{
        println("Enter a Number: ")
        val input = readLine()
        val n = input?.toIntOrNull()
        var sum = 0.0
        if (n != null) {
                var sum = 0.0
                for (i in 1..n) {
                        // Add the ith term to the sum.
                        sum += 1.0 / i
                }

                println(sum)

        }
        else{
                println("This is an invalid")
        }
}

