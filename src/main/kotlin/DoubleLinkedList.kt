package org.example

/**
 * A doubly linked list implementation of the LinkedList interface.
 * @param T The type of elements held in the list.
 */
class DoubleLinkedList<T>: LinkedList<T> {
    /**
     * The first node in the list, or null if the list is empty.
     */
    private var head: Node<T>? = null

    /**
     * The last node in the list, or null if the list is empty.
     */
    private var tail: Node<T>? = null

    /**
     * Adds an element [data] to the front of the list.
     */
    override fun pushFront(data: T) {
        val newNode = Node(data)
        if (head==null){
            head = newNode
            tail = newNode
            return
        }
        else{
            newNode.next = head
            head?.prev = newNode
            head = newNode
        }
    }

    /**
     * Adds an element [data] to the back of the list.
     */
    override fun pushBack(data: T){
        val newNode = Node(data)
        if (head==null){
            head = newNode
            tail = newNode
            return
        }
        else{
            newNode.prev = tail
            tail?.next = newNode
            tail = newNode
        }
    }

    /**
     * Removes an element from the front of the list.
     * @return the value of the removed element, or null if the list is empty.
     */
    override fun popFront(): T? {
        if (head==null){
            return null
        }
        else if (head == tail){
            val dataToReturn = head?.data
            head = null
            tail = null
            return dataToReturn
        }
        else {
            val dataToReturn = head?.data
            head = head?.next
            head?.prev = null
            return dataToReturn
        }
    }

    /**
     * Removes an element from the back of the list.
     * @return the value of the removed element, or null if the list is empty.
     */
    override fun popBack(): T?{
        if (head==null){
            return null
        }
        else if (head == tail){
            val dataToReturn = tail?.data
            head = null
            tail = null
            return dataToReturn
        }
        else {
            val dataToReturn = tail?.data
            tail = tail?.prev
            tail?.next = null
            return dataToReturn
        }
    }

    /**
     * Returns the value of the element at the front of the list without removing it.
     * @return the value of the element, or null if the list is empty.
     */
    override fun peekFront(): T?{
        return head?.data
    }

    /**
     * Returns the value of the element at the back of the list without removing it.
     * @return the value of the element, or null if the list is empty.
     */
    override fun peekBack(): T?{
        return tail?.data
    }

    /**
     * Checks if the list is empty.
     * @return true if the list is empty, false otherwise.
     */
    override fun isEmpty(): Boolean {
        return head == null
    }
}