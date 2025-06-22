# Sorting Customer Orders – Java

## Scenario

In an e-commerce platform, prioritizing high-value orders is crucial for revenue optimization and resource allocation. This exercise focuses on sorting customer orders by their `totalPrice` to ensure that the highest-value orders are processed first.

---

## 1. Understanding Sorting Algorithms

### Bubble Sort
- A simple comparison-based algorithm.
- Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
- Suitable for small datasets.

| Case         | Time Complexity | Space Complexity |
|--------------|-----------------|------------------|
| Best Case    | O(n)            | O(1)             |
| Average/Worst| O(n²)           |                  |

---

### Insertion Sort
- Builds the sorted array one item at a time by inserting each element into its proper place.
- Efficient for nearly sorted arrays.

| Case      | Time Complexity | Space Complexity |
|-----------|-----------------|------------------|
| Best Case | O(n)            | O(1)             |
| Worst Case| O(n²)           |                  |

---

### Quick Sort
- A divide-and-conquer algorithm.
- Selects a pivot, partitions the array around the pivot, and recursively sorts the subarrays.

| Case         | Time Complexity | Space Complexity     |
|--------------|-----------------|---------------------|
| Best/Average | O(n log n)      | O(log n) (recursive)|
| Worst        | O(n²)           |                     |

---

### Merge Sort
- Another divide-and-conquer algorithm.
- Splits the array in half, sorts each half, and merges them.

| Time Complexity | Space Complexity |
|-----------------|------------------|
| O(n log n)      | O(n)             |

---

## 2. Setup

Create a class `Order` with attributes:

- `orderId` (int)
- `customerName` (String)
- `totalPrice` (double)

---

## 3. Implementation

- **Bubble Sort:** Sorts the array of orders in ascending order of `totalPrice` using basic comparison and swap.
- **Quick Sort:** Sorts the array of orders in ascending order of `totalPrice` using pivot-based recursive partitioning.

---

## 4. Analysis

### Performance Comparison

| Algorithm   | Best Case  | Average Case | Worst Case | Space Complexity |
|-------------|------------|--------------|------------|------------------|
| Bubble Sort | O(n)       | O(n²)        | O(n²)      | O(1)             |
| Quick Sort  | O(n log n) | O(n log n)   | O(n²)      | O(log n)         |

### Why Quick Sort is Preferred

Quick Sort is generally preferred over Bubble Sort due to its significantly better average-case performance. While Bubble Sort is easier to implement, it becomes inefficient for larger datasets. Quick Sort, with a good pivot strategy, performs faster and is suitable for real-time systems and large-scale data sorting.

---
