package com.company

// public class Main {}
class BubbleSort {

    fun main(args: Array<String>) {
        val array = intArrayOf(20, 35, -15, 7, 55, 1, -22)

        for (lastUnsortedIndex in array.size - 1 downTo 1) {
            for (i in 0 until lastUnsortedIndex) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1)
                }
            }
        }

        for (i in 0 until array.size - 1) {
            println(array[i])
        }
    }

    fun swap(array: IntArray, i: Int, j: Int) {
        if (i == j) {
            return
        }

        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}
