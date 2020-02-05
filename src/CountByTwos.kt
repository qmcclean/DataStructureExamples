package com.company

/**
 * growth rates in big O notation (Algorithm)
 *
 * Linear growth rate (Complextity) = O(n) - single loop
 * Quadratic growth rate (Complextity) = O(n^2) - nested loop
 * Constant growth rate (Complextity) = O(1)
 * Cubic growth rate (Complextity) = O(n^3) - 3 nested loops
 * Exponential Growth Rate (Complextity) = O(n^n) - exponential loops
 *
 * how well does an Algorithm scales relative to the size of the input
 * or how many times an algorithm has to run in order to complete based on the size of the input
 */

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val myCounter = Counter("myCounter")
        myCounter.increment()
        myCounter.increment()
        myCounter.increment()
        myCounter.increment()

        System.out.println(myCounter.currentValue)

        val intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(countEvens(intArray))

    }

    internal fun countEvens(elements: IntArray): Int {
        var count = 0
        for (i in elements.indices) {
            if (elements[i] % 2 == 0) {
                count++
            }
        }
        return count
    }

}


class Counter(str: String) {

    private var name: String? = null
    var currentValue = 0
        private set

    init {
        this.name = str
    }

    fun increment() {
        currentValue++
    }

    override fun toString(): String {
        return "$name: $currentValue"
    }
}
