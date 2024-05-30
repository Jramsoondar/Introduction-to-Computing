    fun gcd(one: Int, two: Int): Int
    {
    return if (two == 0) one else gcd(two, one % two)
}

    fun main() {
        val one = 48
        val two = 18
        val result = gcd(one, two)
        println("GCD of $one and $two is $result")
    }
