package org.example

/**
 * Exercise 1
 */
fun main() {
    // 1. Initialize two stacks and several lists to help visualize their contents
    val stackOne = StackOnList<Int?>()
    val listOfStack1 = mutableListOf<Int?>()
    val stackTwo = StackOnList<Int?>()
    val listOfStack2 = mutableListOf<Int?>()
    val tempListStack1 = mutableListOf<Int?>()

    // 2. Populate the first stack and its corresponding list with numbers 1 through 4
    // stackOne will contain (from top to bottom): 4, 3, 2, 1
    // listOfStack1 will contain: 1, 2, 3, 4
    for (i in 1..4) {
        stackOne.push(i)
        listOfStack1.add(i)
    }

    // Create a temporary copy of the list to iterate over. This is done to
    // avoid issues with modifying a list while looping through it
    for (i in listOfStack1) {
        tempListStack1.add(i)
    }

    // 3. Transfer all elements from the first stack to the second stack
    for (i in tempListStack1) {
        // Pop the top element from stackOne
        val poppedValue = stackOne.pop()

        // Print the current state for visualization
        println("stack 1: $listOfStack1")
        println("stack 2: $listOfStack2")

        // Push the popped element onto stackTwo
        stackTwo.push(poppedValue)

        // Update the visualization lists.
        listOfStack1.remove(poppedValue)
        listOfStack2.add(poppedValue)
    }

    // 4. Print the final state of the lists.
    // listOfStack1 will be empty.
    // listOfStack2 will contain the elements in reversed order: 4, 3, 2, 1
    println("stack 1: $listOfStack1")
    println("stack 2: $listOfStack2")
}