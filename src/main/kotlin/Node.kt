package org.example

/**
 * Represents a single node in a doubly linked list.
 * Each node contains a piece of data and references to the next and previous nodes in the list.
 *
 * @param T The type of data held by the node.
 */
class Node<T>(
    //The actual data stored in the node.
    var data: T,

    //A reference to the previous node in the list, or null if this is the head.
    var prev: Node<T>? = null,

    //A reference to the next node in the list, or null if this is the tail.
    var next: Node<T>? = null
)