# Task Management System

## Overview  
This project implements a simple Task Management System using a **Singly Linked List** to manage tasks. The system supports basic operations such as adding, searching, traversing, and deleting tasks efficiently.

---

## 1. Understanding Linked Lists

### Singly Linked List  
A singly linked list consists of nodes where each node contains data and a reference to the next node. It allows efficient insertion and deletion from the beginning or middle of the list.

### Doubly Linked List  
A doubly linked list contains nodes with references to both the next and previous nodes. It allows traversal in both directions but requires more memory per node.

---

## 2. Setup

### Task Class  
The `Task` class includes:
- `taskId`: an integer representing the unique ID of the task.  
- `taskName`: a string containing the name of the task.  
- `status`: a boolean indicating whether the task is completed or pending.

### Node and LinkedList  
- The `Node` class wraps a Task object and a pointer to the next node.  
- The `LinkedList` class manages the head and tail nodes and provides methods to manipulate the task list.

---

## 3. Implementation

### Core Methods
- `add(Task task)`: Adds a new task to the end of the list.  
- `traverse()`: Displays all tasks in the list with their ID, name, and status.  
- `search(int taskId)`: Searches for a task by ID and prints its location.  
- `delete(int taskId)`: Deletes a task with the specified ID, handling head and tail cases.

### Example Usage in `Main.java`
```java
LinkedList taskList = new LinkedList();

taskList.add(new Task(1, "Finish Assignment", false));
taskList.add(new Task(2, "Attend Meeting", true));
taskList.add(new Task(3, "Workout", false));

taskList.traverse();

taskList.search(2);
taskList.delete(2);
taskList.traverse();
```
## 4.  Analysis
Time Complexity

* Add: O(1) (insertion at the end using tail reference)

* Search: O(n)

* Traverse: O(n)

* Delete: O(n)

Advantages of Linked Lists over Arrays

* Dynamic Size: Unlike arrays, linked lists do not require pre-allocated size and grow dynamically.

* Efficient Insertions/Deletions: Inserting or deleting elements (especially in the middle) is faster as it does not require shifting elements like in arrays.

* Memory Efficiency: Memory allocation is done as needed, avoiding wastage seen in over-sized arrays.

---

## Files

Task.java: Defines the Task class.

Main.java: Contains the Node, LinkedList, and Main classes for execution and logic.

---

## How to Run

Compile all Java files in the same directory:

```bash
javac *.java
java Main
```


