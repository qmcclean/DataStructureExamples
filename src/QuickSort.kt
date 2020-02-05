package com.company

class QuickSort {

    /**
     * creates a pivot element and adds items that are less than the pivot element to the left array
     * all elements greater than the pivot are placed to the right array of the pivot element
     * the left and right sub arrays are not sorted.
     *
     * this is all done in one place so no need to create a temp array
     * @param args
     */

    fun main(args: Array<String>) {
        val myArray = intArrayOf(20, 35, -15, 7, 55, 1, -22)

        quickSort(myArray, 0, myArray.size)

        for (i in myArray.indices) {
            println(myArray[i])
        }
    }

    fun quickSort(input: IntArray, start: Int, end: Int) {
        if (end - start < 2) {
            return
        }

        val pivotIndex = partition(input, start, end)
        // recursive call so breaks elements down into sub arrays
        quickSort(input, start, pivotIndex)
        quickSort(input, pivotIndex + 1, end)
    }

    fun partition(input: IntArray, start: Int, end: Int): Int {
        // this is using the first element as the pivot
        val pivot = input[start]
        var i = start
        var j = end

        while (i < j) {
            // empty loop body this continues to decrement j until we find an element that is less than the pivot or j crosses i
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j]
            }

            // empty loop body this continues to decrement j until we find an element that is less than the pivot or j crosses i
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i]
            }
        }

        input[j] = pivot
        return j
    }
}
