# Library Management System

## Overview  
This project implements a **Library Management System** where users can search for books by **title** or **author** using both **linear** and **binary search** algorithms. The system is built using **Java** and stores books in an `ArrayList`.

---

## 1. Understanding Search Algorithms

### Linear Search  
- Sequentially checks each element in the list until the desired element is found.  
- Works on unsorted data.  
- Slower performance for large datasets.  

### Binary Search  
- Efficient search that repeatedly divides the **sorted list** in half to locate the target element.  
- Requires the list to be sorted based on the search attribute.

---

## 2. Setup

### Book Class  
The `Book` class contains the following attributes:
- `bookId`: A unique integer identifier for each book.  
- `title`: The title of the book.  
- `author`: The name of the author.

---

## 3. Implementation

### Methods

- `linearSearch(ArrayList<Book> books, String author, String title)`  
  Searches the book list linearly and prints the `hashCode` if the title or author matches.

- `binarySearchByTitle(ArrayList<Book> books, String title)`  
  Performs binary search on the list sorted by **title** and returns the index if found.

- `binarySearchByAuthor(ArrayList<Book> books, String author)`  
  Performs binary search on the list sorted by **author** and returns the index if found.

### Example Usage  
The `main` method creates a list of books, adds sample entries, sorts the list as needed, and performs search operations using both linear and binary search methods.

---

## 4. Analysis

### Time Complexity

| Algorithm      | Time Complexity | Requirements         |
|----------------|------------------|-----------------------|
| Linear Search  | O(n)             | No sorting required   |
| Binary Search  | O(log n)         | Requires sorted list  |

### When to Use
- **Linear Search** is suitable for small or **unsorted datasets** and quick, simple lookups.  
- **Binary Search** is optimal for **large, sorted datasets** where fast lookup is essential.

---

## How to Run

Place both `Book.java` and `Main.java` in the same directory.

### Compile and run:
```bash
javac *.java
java Main
```

## Files

* Book.java: Defines the book structure.

* Main.java: Contains logic for search and test execution.

