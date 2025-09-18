import org.example.DoubleLinkedList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DoubleLinkedListTest {
    @Test
    fun pushFrontOnEmptyList() {
        var list = DoubleLinkedList<Int>()
        list.pushFront(5)
        assertEquals(5, list.peekFront())
        assertEquals(5, list.peekBack())
    }
    @Test
    fun pushFrontOnList() {
        var list = DoubleLinkedList<Int>()
        list.pushFront(5)
        assertEquals(5, list.peekFront())
        list.pushFront(10)
        assertEquals(10, list.peekFront())
        assertEquals(5, list.peekBack())
    }

    @Test
    fun pushBackOnEmptyList() {
        var list = DoubleLinkedList<Int>()
        list.pushBack(5)
        assertEquals(5, list.peekBack())
        assertEquals(5, list.peekFront())
    }

    @Test
    fun pushBackOnList(){
        var list = DoubleLinkedList<Int>()
        list.pushBack(5)
        assertEquals(5, list.peekBack())
        list.pushBack(10)
        assertEquals(10, list.peekBack())
        assertEquals(5, list.peekFront())
    }

    @Test
    fun popFrontOnEmptyList() {
        var list = DoubleLinkedList<Int>()
        list.popFront()
        assertEquals(null, list.peekFront())
    }
    @Test
    fun popFrontOnList(){
        var list = DoubleLinkedList<Int>()
        list.pushFront(5)
        list.popFront()
        assertEquals(null, list.peekFront())
        assertEquals(true, list.isEmpty())
    }
    @Test
    fun popFrontOnMultiItemList() {
        val list = DoubleLinkedList<Int>()
        list.pushFront(5)
        list.pushFront(10)
        val poppedValue = list.popFront()
        assertEquals(10, poppedValue)
        assertEquals(5, list.peekFront())
        assertEquals(false, list.isEmpty())
    }

    @Test
    fun popBackOnEmptyList() {
        var list = DoubleLinkedList<Int>()
        list.popBack()
        assertEquals(null, list.peekBack())
    }
    @Test
    fun popBackOnList() {
        var list = DoubleLinkedList<Int>()
        list.pushFront(5)
        list.popBack()
        assertEquals(null, list.peekFront())
        list.pushFront(10)
        list.pushFront(5)
        list.popBack()
        assertEquals(5, list.peekBack())
    }

    @Test
    fun peekFrontOnEmptyList() {
        var list = DoubleLinkedList<Int>()
        list.peekFront()
        assertEquals(null, list.peekFront())
    }
    @Test
    fun peekFrontOnList() {
        var list = DoubleLinkedList<Int>()
        list.pushFront(5)
        assertEquals(5, list.peekFront())
    }

    @Test
    fun peekBackOnEmptyList() {
        var list = DoubleLinkedList<Int>()
        list.peekBack()
        assertEquals(null, list.peekFront())
    }
    @Test
    fun peekBackOnList() {
        var list = DoubleLinkedList<Int>()
        list.pushFront(5)
        list.pushFront(10)
        assertEquals(5, list.peekBack())
    }

    @Test
    fun isEmpty() {
        var list = DoubleLinkedList<Int>()
        list.pushFront(5)
        assertEquals(false, list.isEmpty())
    }

}