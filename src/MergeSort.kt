package com.company

class MergeSort {

    fun main(args: Array<String>) {
        val myArray = intArrayOf(20, 35, -15, 7, 55, 1, -22)

        mergeSort(myArray, 0, myArray.size)

        for (i in myArray.indices) {
            println(myArray[i])
        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    fun mergeSort(input: IntArray, start: Int, end: Int) {
        if (end - start < 2) {
            return
        }

        // breaks the array up into left partition and right partition
        // left contains 3 elements which are broken down into 1 element arrays
        // right contains 4 elements which are broken down to two and then one element arrays
        // all elements are sorted here
        val mid = (start + end) / 2
        mergeSort(input, start, mid)
        mergeSort(input, mid, end)
        merge(input, start, mid, end)
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    fun merge(input: IntArray, start: Int, mid: Int, end: Int) {
        // compares the last element in the left partition and the first element in the right partition
        // so this checks if the last element in the left partition is smaller than the first element in the right partition, terminate
        if (input[mid - 1] <= input[mid]) {
            return
        }

        var i = start
        var j = mid
        // keeps track of the position in the tempArray
        var tempIndex = 0

        // temporary array to store the values we are merging.  This has to be large enough to hold all of the values from our input object
        val temp = IntArray(end - start)
        // here we are traversing the both arrays.  if i is smaller than mid and j is smaller than end we will drop out of the loop
        while (i < mid && j < end) {
            // if input[i] is less than or equal to input[j] we will write whatever is at i into the temp array as its the smaller of the two
            // else we write the value of j
            temp[tempIndex++] = if (input[i] <= input[j]) input[i++] else input[j++]
        }
        /**
         *
         */
        System.arraycopy(input, i, input, start + tempIndex, mid - i)
        System.arraycopy(temp, 0, input, start, tempIndex)
    }

}
