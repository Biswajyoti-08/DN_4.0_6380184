# Exercise 4: Employee Management System

## Scenario  
You are developing an employee management system for a company. Efficiently managing employee records is crucial.

---

## 1. Understand Array Representation  
Arrays are a linear data structure stored in contiguous memory locations. Each element in the array can be accessed directly using its index, which allows for constant time access. This makes arrays efficient for fixed-size collections where rapid access is required.

### Advantages of Arrays:
- Constant-time access to elements using index  
- Simple to use and implement  
- Efficient for iteration and fixed-size datasets

---

## 2. Setup  
An Employee class is created with the following attributes:
- `employeeId` (immutable identifier)  
- `name` (String)  
- `position` (String)  
- `salary` (double)

---

## 3. Implementation  
The main logic is implemented using a static array of Employee objects. The system demonstrates the following operations:
- Add an employee to the array  
- Search for an employee by ID  
- Traverse all employee records  
- Delete an employee by ID  

Each operation is demonstrated with a single hardcoded example in Main.java.

---

## 4. Analysis

### Time Complexity:
- Add: O(1) (amortized if there's space)  
- Search: O(n)  
- Traverse: O(n)  
- Delete: O(n) due to shifting elements  

### Limitations of Arrays:
- Fixed size at declaration  
- Inefficient for dynamic insertions or deletions  
- Manual memory and index management required  

### When to Use Arrays:
- When the number of elements is known and fixed  
- When random access is required frequently  
- For performance-critical scenarios with minimal insertions/deletions
