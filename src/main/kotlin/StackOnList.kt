package org.example

/**
 * A stack implementation that uses a DoubleLinkedList as its underlying data structure. LIFO Last in First Out
 * @param T The type of elements held in the stack.
 */
class StackOnList<T> : Stack<T> {
    private val list = DoubleLinkedList<T>()

    /**
     * Adds an element [data] to the top of the stack.
     */
    override fun push(data: T) {
        list.pushFront(data)
    }

    /**
     * Removes the element at the top of the stack.
     * @return the value at the top of the stack or null if the stack is empty.
     */
    override fun pop(): T? {
        return list.popFront()
    }

    /**
     * Returns the value at the top of the stack without removing it.
     * @return the value at the top of the stack or null if the stack is empty.
     */
    override fun peek(): T? {
        return list.peekFront()
    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    override fun isEmpty(): Boolean {
        return list.isEmpty()
    }
}