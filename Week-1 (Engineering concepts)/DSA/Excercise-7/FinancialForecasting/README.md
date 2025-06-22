# Financial Forecasting Tool

## Overview  
This project implements a financial forecasting tool in Java that predicts future values using a recursive algorithm. The prediction is based on a starting amount, a growth rate, and the number of years to forecast.

## 1. Understanding Recursive Algorithms  
Recursion is a programming approach where a function calls itself to solve smaller subproblems. It helps simplify problems that involve repetitive computations, such as financial projections, by reducing the problem to a base case and solving the rest recursively.

## 2. Setup  
A Forecast class is used to encapsulate the input values:

- currentValue: the current financial value  
- growthRate: the annual percentage increase  
- futureYears: the number of years to forecast  

The Main class contains the recursive method to calculate the future value using this data.

## 3. Implementation  
The `predictFutureValue(Forecast obj)` method is implemented recursively. It multiplies the current value by (1 + growthRate) each year and reduces the number of years by one until it reaches zero. At that point, the future value is returned.

### Sample Usage  
```java
Forecast obj = new Forecast(1234, 0.05, 5);
double result = predictFutureValue(obj);
System.out.println("Predicted Future Value: " + result);
```
---

## 4. Analysis

Time Complexity

The recursive method has a linear time complexity of O(n), where n is the number of years. This is because the method makes one recursive call for each year.

## Optimization

While recursion simplifies the logic, it also consumes stack memory. For large inputs, this may lead to stack overflow. To optimise:

Convert the logic to an iterative approach

Avoid modifying the input object directly to maintain immutability

Use memoization if the calculation involves overlapping subproblems

## How to Run
Place both Forecast.java and Main.java in the same directory.

## Compile and run:

```java
javac *.java
java Main
