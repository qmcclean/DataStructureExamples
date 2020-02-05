
class SuperTrim {
    fun main(args: Array<String>) {
        val stringArray = "   Hell   world   "
        println(trim(stringArray))

    }

    private fun trim(string: String): String {
        return string.trim { it <= ' ' }.replace("\\s+".toRegex(), " ")
    }
}