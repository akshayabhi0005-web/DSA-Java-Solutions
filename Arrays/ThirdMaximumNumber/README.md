# Third Maximum Number

### 💡 Approach
Keep track of the first, second, and third largest **distinct** numbers.

- Bigger number → update positions
- Duplicate number → ignore
- If third maximum doesn't exist → return the maximum

### Example

```text
Input:  [2,2,3,1]
Output: 1
```

### Complexity
- **Time:** O(n)
- **Space:** O(1)
