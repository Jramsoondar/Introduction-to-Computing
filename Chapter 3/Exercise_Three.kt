
    fun main(){
        println()
    }
    fun isPalindrome(s: String): Boolean {
        val n = s.length
        for (i in 0 until n / 2) {
            if (s[i] != s[n - 1 - i]) {
                return false
            }
        }
        return true
    }
