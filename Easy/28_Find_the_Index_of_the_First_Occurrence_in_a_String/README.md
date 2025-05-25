## Points to Note for Approach 2:
---

### 🔍 1. Why `i <= hLen - nLen`?

**Let:**
- `hLen` = length of `haystack`
- `nLen` = length of `needle`
- `i` = index iterating over every possible starting position in `haystack`  
  → checks if the substring from index `i` matches the `needle`

So `i <= hLen - nLen` means:
- At index `i = hLen - nLen`, the last valid substring of length `nLen` starts.
- Anything after this index doesn't leave enough characters to match the full `needle`.

**🧪 Example:**
```text
haystack = "abcde" (length = 5)
needle   = "cd"    (length = 2)

i goes from 0 to 3 (5 - 2):
- i = 0 → "ab"
- i = 1 → "bc"
- i = 2 → "cd" ✅
- i = 3 → "de"
- i = 4 → ❌ (only "e" — not enough chars left)
```
👉 So we stop at `i = 3` — that's why `i <= hLen - nLen`.

---

### 🔍 2. Why `while (j < nLen && haystack.charAt(i + j) == needle.charAt(j))`

**Function of the Loop:**  
"Is the substring starting at `i` in `haystack` the same as `needle`?"

**Let:**
- `i`: where the window starts
- `i + j`: current character in `haystack` being compared
- `j`: current character in `needle`

So `i + j` means: "Step `j` units forward from the start of the window."

**🧪 Example:**
```text
haystack = "abcde"
needle   = "cd"
```

| i   | j | haystack.charAt(i + j) | needle.charAt(j) | Match? |
|-----|---|------------------------|------------------|--------|
| 0   | 0 | 'a'                    | 'c'              | ❌     |
| 1   | 0 | 'b'                    | 'c'              | ❌     |
| 2   | 0 | 'c'                    | 'c'              | ✅     |
| 2   | 1 | 'd'                    | 'd'              | ✅     |
✅ j = 2, which equals `needle.length()` → return `i = 2`

---

### 🔍 3. Two Cases for the `while` Loop to Break:

1. **Mismatch** → characters at position `j` don't match → break.
2. **Full match** → `j == nLen` → we matched all characters → return `i`.

---