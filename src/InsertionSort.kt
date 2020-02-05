package com.company

class InsertionSort {

    fun main(args: Array<String>) {
        val intArray = intArrayOf(20, 35, -15, 7, 55, 1, -22)
        //       Insertion sort code.
        //        for (int firstUnsortedIndex =1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
        //            int newElement = intArray[firstUnsortedIndex];
        //
        //            int i;
        //
        //            for (i = firstUnsortedIndex; i > 0 && intArray[i -1] > newElement; i--) {
        //                intArray[i] = intArray[i - 1];
        //            }
        //
        //            intArray[i] = newElement;
        //        }

        // updating insertion sort using shell sort
        var gap = intArray.size / 2
        while (gap > 0) {
            for (i in gap until intArray.size) {
                val newElement = intArray[i]

                var j = i

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap]
                    j -= gap
                }

                intArray[j] = newElement
            }
            gap /= 2
        }

        for (i in intArray.indices) {
            println(intArray[i])
        }
    }
}
