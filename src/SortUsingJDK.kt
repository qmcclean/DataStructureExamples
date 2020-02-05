import java.util.*

class SortUsingJDK {
    fun main(args: Array<String>) {
        val intArray = intArrayOf(20, 35, -15, 7, 55, 1, -22)

        //        Arrays.sort(intArray);
        Arrays.parallelSort(intArray)

        for (i in intArray.indices) {
            println(intArray[i])
        }
    }
}