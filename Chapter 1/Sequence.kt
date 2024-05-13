//Ex 4: reimplement a random sequence numbers ( refer to page 128 of our textbook)
object RandomSeq {
    @JvmStatic
    fun main(args: Array<String>) { // Print a random sequence of n real values in [0, 1)
        val n = args[0].toInt()
        for (i in 0 until n) println(Math.random())
    }
}