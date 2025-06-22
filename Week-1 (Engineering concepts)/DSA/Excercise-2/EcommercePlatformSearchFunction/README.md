# E-commerce Platform Search Function – Java

## 1. Understanding Asymptotic Notation

### 📌 Big O Notation

Big O notation is a mathematical representation used to describe the upper bound of an algorithm's runtime or space requirement in terms of the input size. It helps developers and engineers analyze how efficiently an algorithm scales as the input size grows.

It is particularly useful to:

- Evaluate worst-case performance
- Compare algorithm efficiency independent of hardware or language

---

### 🔍 Best, Average, and Worst-Case Scenarios for Search Operations

#### 📗 Linear Search
- **Best Case:** O(1) (element is at the beginning)
- **Average Case:** O(n/2) ≈ O(n)
- **Worst Case:** O(n) (element is at the end or not found)

#### 📘 Binary Search
- **Best Case:** O(1) (element is in the middle)
- **Average Case:** O(log n)
- **Worst Case:** O(log n)
- **Note:** Requires the array to be sorted

---

## 2. Setup

Create a `Product` class with the following attributes:

- `productId`: A unique identifier for each product
- `productName`: The name of the product
- `category`: Category such as "Electronics", "Wardrobe", etc.

This structure supports meaningful searching across product attributes.

---

## 3. Implementation

### ✅ Linear Search
- Iterates through each element sequentially
- Works on unsorted arrays
- Stops when a match is found or all elements are checked

### ✅ Binary Search
- Operates on a **sorted** array
- Uses **divide-and-conquer** to reduce the search range
- Compares the middle element to the target `productId`
- Array is sorted using `Arrays.sort()` with a comparator

---

## 4. Analysis

### ⏱ Time Complexity

| Algorithm       | Best Case | Average Case | Worst Case |
|----------------|-----------|--------------|-------------|
| Linear Search   | O(1)      | O(n)         | O(n)        |
| Binary Search   | O(1)      | O(log n)     | O(log n)    |

---

### 💡 Suitability for the E-commerce Platform

- **Linear Search:** Easy to implement but inefficient for large datasets
- **Binary Search:** Much faster for large datasets but requires a sorted list

#### ✅ Conclusion:
For an e-commerce platform where performance and scalability matter, **Binary Search** is the better choice. Sorting or indexing product data (common in production systems) allows Binary Search to perform efficiently, delivering faster results.

---

## 5. File Summary

- `Product.java`: Defines the `Product` class with required fields
- `Search.java`: Contains implementations for both `linearSearch` and `binarySearch`
- Products are printed after each search for result comparison

---
