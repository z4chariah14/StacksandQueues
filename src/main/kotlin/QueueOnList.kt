package org.example

/**
 * A queue implementation that uses a DoubleLinkedList as its underlying data structure.
 * This implementation is an example of a FIFO (First-In, First-Out)
 * structure by using opposite ends of the list for adding and removing elements.
 *
 * @param T The type of elements held in the queue.
 */
class QueueOnList<T>: Queue<T> {
    private val list = DoubleLinkedList<T>()

    /**
     * Returns the value at the front of the queue without removing it.
     * @return the value of the element, or null if the queue is empty.
     */
    override fun peek(): T? {
        return list.peekBack()
    }

    /**
     * Adds an element [data] to the end of the queue.
     */
    override fun enqueue(data: T){
        list.pushFront(data)
    }

    /**
     * Removes an element from the front of the queue.
     * @return the value of the removed element, or null if the queue is empty.
     */
    override fun dequeue(): T? {
        return list.popBack()
    }

    /**
     * Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise.
     */
    override fun isEmpty(): Boolean {
        return list.isEmpty()
    }
}