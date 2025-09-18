import org.example.StackOnList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * Unit tests for the StackOnList class.
 */
class StackOnListTest {
    /**
     * Verifies that pushing an element makes it the top of the stack.
     */
    @Test
    fun push() {
        val l = StackOnList<Int>()
        l.push(2)
        assertEquals(2, l.peek())
    }

    /**
     * Verifies that popping from an empty stack returns null.
     */
    @Test
    fun popOnEmptyList() {
        val l = StackOnList<Int>()
        val poppedValue = l.pop()
        assertEquals(null, poppedValue)
    }

    /**
     * Verifies that popping the only element in a stack returns the correct
     * value and leaves the stack empty.
     */
    @Test
    fun popOnList() {
        val l = StackOnList<Int>()
        l.push(3)
        val poppedValue = l.pop()
        assertEquals(3, poppedValue)
        assertEquals(true, l.isEmpty())
    }

    /**
     * Verifies that peeking at an empty stack returns null.
     */
    @Test
    fun peekOnEmptyList() {
        val l = StackOnList<Int>()
        val value = l.peek()
        assertEquals(null, value)
    }

    /**

     * Verifies that peeking at a stack with one element returns that element's value.
     */
    @Test
    fun peekOnList() {
        val l = StackOnList<Int>()
        l.push(3)
        val value = l.peek()
        assertEquals(3, value)
    }

    /**
     * Verifies that peeking at a multi-item stack returns the last element
     * pushed, confirming LIFO behavior.
     */
    @Test
    fun peekOnMultiItemList() {
        val l = StackOnList<Int>()
        l.push(3)
        l.push(4)
        val value = l.peek()
        assertEquals(4, value)
    }

    /**
     * Verifies that a new stack is empty and is not empty after an element is pushed.
     */
    @Test
    fun isEmpty() {
        val l = StackOnList<Int>()
        assertTrue(l.isEmpty())
        l.push(3)
        assertFalse(l.isEmpty())
    }

}