package com.company

/**
 * Radix sort must be a stable counting sort
 */

class RadixSort {

    fun main(args: Array<String>) {
        val intArray = intArrayOf(4725, 4586, 1330, 8792, 1594, 5729)

        radixSort(intArray, 10, 4)

        for (i in intArray.indices) {
            println(intArray[i])
        }
    }

    fun radixSort(input: IntArray, radix: Int, width: Int) {
        for (i in 0 until width) {
            radixSingleSort(input, i, radix)
        }
    }

    fun radixSingleSort(input: IntArray, position: Int, radix: Int) {
        val numItems = input.size

        val countArray = IntArray(radix)

        for (value in input) {
            countArray[getDigit(position, value, radix)]++
        }

        for (j in 1 until radix) {
            countArray[j] += countArray[j - 1]
        }

        val temp = IntArray(numItems)
        for (tempIndex in numItems - 1 downTo 0) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex]
        }

        for (tempIndex in 0 until numItems) {
            input[tempIndex] = temp[tempIndex]
        }
    }

    fun getDigit(position: Int, value: Int, radix: Int): Int {
        return value / Math.pow(10.0, position.toDouble()).toInt() % radix
    }
}
