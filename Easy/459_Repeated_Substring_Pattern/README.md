## ✅ Approach 1: String Builder

### 🔁 Overall Logic
- Checking only substrings that evenly divide s.
- Repeating the candidate pattern len / i times and comparing it to the original string.

### 📌 Key Insights

- **Why `i = 1` and not i = 0?**  
  If `i = 0`, then `s.substring(0, 0)` would return an empty string. So, starting from `i = 1` ensures you're testing actual, meaningful substrings.

- **Why `i <= len / 2`?**  
  Any repeated substring must be shorter than or equal to half the length of the string.
  Anything longer would mean it can't repeat enough times to form the full string.

- **Why `len%i!=0`?**  
  A repeating unit would be considered valid only if the total string length `len` is divisible by the candidate substring length `i`.

- **Why `repeats = len / i`?**  
  If the pattern has length `i`, then `len / i` gives the number of times it would need to repeat to form the full string.

### ⏱️ Time & Space Complexity

- **Time Complexity:** O(n²)
  - Looping over all possible substrings up to length n/2
  - For each, constructing a repeated string of length n

- **Space Complexity:** O(n)  
  - Temporary strings are created for the pattern and the repeated candidate.

---

## 🧠 Approach 2: String Manipulation

### 🔁 Overall Logic
s + s → remove first and last character → check if original s is in the result

### 📌 Key Insights

- **Removing the first and last character removes:**  
  The original full `s` that appears at position 0 in s + s and   
  The mirrored full `s` at the end

### ⏱️ Time & Space Complexity

- **Time Complexity:** O(n)  
  - The operations used in this approach — concat(), substring(), and contains() — each take O(n) time in the worst case.  

- **Space Complexity:** O(n)  
  - Strings are immutable in Java, which means operations like concat() and substring() create new string instances rather than modifying the original.

---
