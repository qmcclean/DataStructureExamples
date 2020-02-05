package com.company

class Recursion {

    fun main(args: Array<String>) {
        println(recursiveFactorial(3))
        println(iterativeFactorial(3))
    }

    fun recursiveFactorial(num: Int): Int {
        return if (num == 0) {
            1
        } else num * recursiveFactorial(num - 1)

    }

    fun iterativeFactorial(num: Int): Int {
        if (num == 0) {
            return 1
        }

        var factorial = 1

        for (i in 1..num) {
            factorial *= i
        }

        return factorial
    }
}
