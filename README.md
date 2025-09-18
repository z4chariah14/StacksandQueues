# StacksandQueues

This Repository involves the implementation of Stack and Queue data structures in Kotlin, including a `DoubleLinkedList` and `Stack` and `Queue` classes. Demonstrates the practical application of core data structure principles like LIFO (Last-In, First-Out) and FIFO (First-In, First-Out) to solve problems. I have attempted to solve exercises 3 (in Kotlin), 4, and 5 (in writing).

---
## Exercise 4: Valid Parentheses

Problem can be solved using a **Stack**.

### Strategy
1.  Initialize an empty stack.
2.  Iterate through the input string character by character.
3.  If the character is an **opening bracket** (`(`, `[`, or `{`), **push** it onto the stack.
4.  If the character is a **closing bracket** (`)`, `]`, or `}`):
    * If the stack is empty, there is no matching opener, so the string is **invalid**.
    * **Pop** the top element from the stack. If it does not form a matching pair with the current closing bracket, the string is **invalid**.
5.  After the loop finishes, if the stack is **empty**, all brackets were matched, and the string is **valid**. If the stack is **not empty**, there are unclosed opening brackets, and the string is **invalid**.

---
## Exercise 5: Copy Stack

The goal is to create a copy of a stack while preserving the original stack and its original order of elements. Since popping from one stack and pushing to another reverses the order, a double-reversal is required. This can be achieved using three stacks.

### Strategy (Using 3 Stacks)
Let's call the stacks **`original`**, **`auxiliary`**, and **`copy`**.

1.  **First Reversal:** Pop every element from the `original` stack and push it onto the `auxiliary` stack. At the end of this step, `original` will be empty, and `auxiliary` will hold all the elements in reverse order.
2.  **Copy and Restore:** Pop every element from the `auxiliary` stack. For each element, push it onto **both** the `original` stack and the `copy` stack.
3.  **Result:** At the end of this step, `auxiliary` will be empty. The `original` stack will be fully restored to its initial state, and the `copy` stack will contain all the same elements in the exact same order.
