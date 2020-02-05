package com.company.ds

/**
 * First come first serve rule
 */
class Queue(
    private val maxSize: Int // initializes the set number of slots
) {
    private val queArray: LongArray // slots to main the data
    private var front: Int = 0 // this will be the index of the position for the element in the front
    private var rear: Int = 0 // going to be the index position for the element at the back of the queue
    private var nItems: Int = 0 // counter to maintain the number of items in the queue

    val isEmpty: Boolean
        get() = nItems == 0

    val isFull: Boolean
        get() = nItems == maxSize

    init {
        this.queArray = LongArray(maxSize)
        front = 0
        rear = -1
        nItems = 0
    }

    fun insert(j: Long) {
        // this is called a circular queue
        if (rear == maxSize - 1) {
            rear = -1
        }

        rear++
        queArray[rear] = j
        nItems++
    }

    fun remove(): Long {
        // removes items from the front of the queue
        val temp = queArray[front]
        front++
        if (front == maxSize) {
            //sets front back to the 0th index so that we can utilize the entire array again
            front = 0
        }
        nItems--
        return temp
    }

    fun peekFront(): Long {
        return queArray[front]
    }

    fun view() {
        println("[")
        for (i in queArray.indices) {
            println(queArray[i].toString() + " ")
        }
        println("]")
    }


}
