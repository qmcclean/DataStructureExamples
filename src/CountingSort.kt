package com.company
// public class Main {}
class CountingSort {

    /**
     * Use when the range of values is reasonable and the data set is a reasonable size
     * so the range of items isn't larger than the items we are looking to sort
     * @param args
     */

    fun main(args: Array<String>) {
        val intArray = intArrayOf(2, 5, 9, 8, 2, 8, 7, 10, 4, 3)

        countingSort(intArray, 1, 10)

        for (i in intArray.indices) {
            println(intArray[i])
        }
    }

    fun countingSort(input: IntArray, min: Int, max: Int) {
        val countArray = IntArray(max - min + 1)

        for (i in input.indices) {
            countArray[input[i] - min]++
            val j = 0

        }

        var j = 0
        for (i in min..max) {
            while (countArray[i - min] > 0) {
                input[j++] = i
                countArray[i - min]--
            }
        }
    }
}
