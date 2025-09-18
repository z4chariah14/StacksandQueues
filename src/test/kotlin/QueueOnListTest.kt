import org.example.QueueOnList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * Unit tests for the QueueOnList class.
 */
class QueueOnListTest {
    /**
     * Verifies that peeking at an empty queue returns null.
     */
    @Test
    fun peekOnEmptyList() {
        val list = QueueOnList<Int>()
        assertEquals(null, list.peek())
    }

    /**
     * Verifies that peeking at a queue with one element returns that element's value.
     */
    @Test
    fun peekOnList(){
        val list = QueueOnList<Int>()
        list.enqueue(4)
        assertEquals(4, list.peek())
    }

    /**
     * Verifies that enqueuing an element makes it the front of a new queue.
     */
    @Test
    fun enqueue() {
        val list = QueueOnList<Int>()
        list.enqueue(5)
        assertEquals(5, list.peek())
    }

    /**
     * Verifies that dequeuing from an empty queue returns null and the queue remains empty.
     */
    @Test
    fun dequeueOnEmptyList() {
        val list = QueueOnList<Int>()
        val value = list.dequeue()
        assertEquals(null, value)
        assertEquals(null, list.peek())
    }

    /**
     * Verifies that dequeuing the only element in a queue leaves the queue empty.
     */
    @Test
    fun dequeueOnList(){
        val list = QueueOnList<Int>()
        list.enqueue(4)
        list.dequeue()
        assertEquals(null, list.peek())
        assertTrue(list.isEmpty())
    }

    /**
     * Verifies that dequeuing from a multi-item queue removes the first element
     * that was added, confirming FIFO behavior.
     */
    @Test
    fun dequeueOnMultiItemsList(){
        val list = QueueOnList<Int>()
        list.enqueue(5)
        list.enqueue(6)
        list.dequeue()
        assertEquals(6, list.peek())
    }

    /**
     * Verifies that a new queue is empty and is not empty after an element is added.
     */
    @Test
    fun isEmpty() {
        val list = QueueOnList<Int>()
        assertTrue(list.isEmpty())
        list.enqueue(5)
        assertFalse(list.isEmpty())
    }
}