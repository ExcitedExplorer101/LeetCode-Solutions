## Problem Statement
[66. Plus One]( https://leetcode.com/problems/plus-one/)

## ✅ Notes:
- **Approach 1** is a straightforward brute-force method using an auxiliary data structure (ArrayList).
- **Approach 2** eliminates the need for an extra list and handles special cases smartly.
- **Approach 3** further optimizes the flow by performing early exits once a digit < 9 is found. Only the all-9s case requires a full traversal of the array.

---
## 🔍 Cases Considered
- **No Carry:** The last digit is less than 9, so an in-place increment suffices.
- **All Digits are 9:** e.g., [9,9,9] becomes [1,0,0,0] – special case requiring extra space.
- **Trailing 9s:** Only the last digit(s) are 9s – requires carry propagation (e.g., [1,9,9]).

---
## ✅ Approach 1: Auxiliary List

### 🔁 Overall Logic
- Check if the last digit can be incremented without carry.
- If not, use an auxiliary `ArrayList` to simulate manual addition from right to left, adding digits and managing carry as needed.
- Finally, convert the list to an array.

### ⏱️ Time & Space Complexity

- **Time Complexity:** O(n)
  - Linear traversal of digits.

- **Space Complexity:** O(n)  
  - Due to use of an additional list.
---

## ✅ Approach 2: List Free

### 🔁 Overall Logic
- Check if the last digit can be incremented without carry.
- Then check if all digits are 9 (special case that leads to increase in array size).   
- If not, traverse in-place from the end, incrementing digits and propagating carry without using additional data structure.

### ⏱️ Time & Space Complexity

- **Time Complexity:** O(n)  
  - Linear traversal of digits.

- **Space Complexity:** O(n)  
  - New array is created ONLY for the all-9 case; otherwise done in-place.
---

## ✅ Approach 3: Early Exit

### 🔁 Overall Logic
- Traverse the array from the end.
- As soon as a digit is less than 9, increment and return early.
- If all digits are 9, then the loop ends with all zeros and a new array with a leading 1 is returned.

### ⏱️ Time & Space Complexity

- **Time Complexity:** O(n)  
  - Worst case when all digits are 9.

- **Space Complexity:** O(n)  
  - New array returned only for the all-nine case.
  
---