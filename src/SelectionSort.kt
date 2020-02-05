object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val intArray = intArrayOf(20, 35, -15, 7, 55, 1, -22)

        for (lastUnsortedIndex in intArray.size - 1 downTo 1) {
            var largest = 0

            for (i in 1..lastUnsortedIndex) {
                if (intArray[i] > intArray[largest]) {
                    largest = i
                }
            }
            swap(intArray, largest, lastUnsortedIndex)
        }

        for (i in intArray.indices) {
            println(intArray[i])
        }

        val string = "   Hello   World  "
        println(removeWhiteSpace(string))

    }

    fun swap(array: IntArray, i: Int, j: Int) {
        if (array.size == 0) {
            return
        }

        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }



    fun removeWhiteSpace(str: String): String {
        return str.trim().replace("\\s+".toRegex(), " ")
    }

}


object MoreSelectionSort {

    @JvmStatic
    fun main(args: Array<String>) {
        val intArray = intArrayOf(20, 35, -15, 7, 55, 1, -22)

        for (lastUnsortedIndex in intArray.size - 1 downTo 1) {
            var largest = 0

            for (i in 1..lastUnsortedIndex) {
                if (intArray[i] > intArray[largest]) {
                    largest = i
                }
            }
            swap(intArray, largest, lastUnsortedIndex)
        }

        for (i in intArray.indices) {
            println(intArray[i])
        }

        trim()

        val str = "   Hello   World  ".toCharArray()
        val i = trimWhiteSpace(str)
        println(String(str).subSequence(0, i))

        val string = "   Hello   World  "
        println(removeWhiteSpace(string))

    }

    fun swap(array: IntArray, i: Int, j: Int) {
        if (array.size == 0) {
            return
        }

        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }

    fun trim() {
        val myString = "   Hello  world  "
        println(myString.trim { it <= ' ' })
    }


    fun trimWhiteSpace(str: CharArray): Int {
        var count = 0
        for (s in str.indices) {
            if (str[s] != ' ') {
                str[count++] = str[s]
            }
        }
        return count
    }

    fun removeWhiteSpace(str: String): String {
        var str = str
        str = str.replace("\\s".toRegex(), "")
        return str
    }
}