import java.util.Locale
fun main(args: Array<String>) {
    fun translate(dna: String): String {
        var dna = dna
        dna = dna.uppercase(Locale.getDefault())
        val rna = dna.replace("T".toRegex(), "U")
        return rna
    }
}