package com.company.ds

object App {

    @JvmStatic
    fun main(args: Array<String>) {
        val myStack = Stack(3)
        //        myStack.push('2');
        //        myStack.push('4');
        //        myStack.push('6');
        //        myStack.push('8');

        //        while (!myStack.isEmpty()) {
        //            long value = myStack.pop();
        //            System.out.println(value);
        //        }


        val myString = "Hello"
        println(reverseString(myString))

        val myQueue = Queue(5)
        myQueue.insert(100)
        myQueue.insert(1000)
        myQueue.insert(14)
        myQueue.insert(12)
        myQueue.insert(44)
        myQueue.insert(33)
        myQueue.view()
    }

    fun reverseString(str: String): String {
        val stackSize = str.length
        val theStack = Stack(stackSize)
        for (j in 0 until str.length) {
            val value = str[j]
            theStack.push(value)
        }
        var result = ""
        while (!theStack.isEmpty) {
            val ch = theStack.pop()
            result = result + ch
        }
        return result
    }
}


class Stack(private val maxSize: Int) {
    private val stackArray: CharArray
    private var top: Int = 0

    val isEmpty: Boolean
        get() = top == -1

    val isFull: Boolean
        get() = maxSize - 1 == top

    init {
        this.stackArray = CharArray(maxSize)
        this.top = -1
    }

    fun push(j: Char) {
        if (isFull) {
            println("The stack is full")
        } else {
            top++
            stackArray[top] = j
        }
    }

    fun pop(): Char {
        if (isEmpty) {
            println("The stack is empty")
            return 0.toChar()
        }
        val old_top = top
        top--
        return stackArray[old_top]
    }

    fun peak(): Char {
        return stackArray[top]
    }
}
