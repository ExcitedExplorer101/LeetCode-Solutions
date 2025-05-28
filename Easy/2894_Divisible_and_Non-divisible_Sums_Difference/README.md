## Problem Statement
[2894. Divisible and Non-divisible Sums Difference]( https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/)

## ✅ Approach 1: Traversal

### 🔁 Overall Logic
Consider the interval [1,n].
-	Let `num1` be the sum of the integers in this range that aren’t divisible by m.
-	Let `num2` be the sum of those that are divisible by m.

To capture the combined effect of `num1-num2`, we introduce a running total called `result`.
As we walk through each integer i from 1 to n:
-	If `i` isn’t divisible by m, we add it to `result`.
-	If `i` is divisible by m, we subtract it from `result`.
When the traversal ends, the value stored in `result` is exactly the result the problem asks for.

### ⏱️ Time & Space Complexity

- **Time Complexity:** O(n)
  - We traverse all numbers from 1 to n

- **Space Complexity:** O(1)  
  - Only one integer variable `result` was used.

---

## 🧠 Approach 2: Mathematical Derivation

### 🔁 Overall Logic
With arithmetic progression we know that the sum of integers in the range `[1, n]` is `n * (n + 1) / 2 `  

-	First, focus on creating `num2`, i.e., the numbers that are divisible by m.  
The k-th such number is k × m, so their sum is  
       ![num2]( solution-images/math/leetcode2894/num2.png)  
       where `k=m/n` is the count of multiples of m up to n.  

-	Next, to generate `num1`, look at the numbers **not** divisible by m.  
Their sum is simply the total of the first n integers minus num2:
![num1]( solution-images/math/leetcode2894/num1.png)
  
-	The answer the problem asks for is `num1-num2`  
![num1-num2]( solution-images/math/leetcode2894/num1-num2.png)  

-	Finally, substitute the closed form of `num2`:  
![final formula]( solution-images/math/leetcode2894/final_formula.png)    
This single formula lets us compute the desired result directly, **without** any iteration.  

### ⏱️ Time & Space Complexity

- **Time Complexity:** O(1)  
  - No iteration is required.  

- **Space Complexity:** O(1)  
  - Only one integer variable `k` was used.  
---
