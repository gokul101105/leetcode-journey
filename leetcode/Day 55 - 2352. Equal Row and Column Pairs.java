/**

- LeetCode Journey - Day 55
- 
- Problem Name: Equal Row and Column Pairs
- Difficulty: Medium
- 
- Problem:
- Given an n x n integer matrix grid, return the number of pairs (ri, cj)
- such that row ri and column cj are exactly the same.
- 
- LeetCode Link:
- https://leetcode.com/problems/equal-row-and-column-pairs/
- 
- Approach:
- 
-    Step 1:
-    Convert each row into a string pattern and store its frequency in a HashMap
- 
-    Step 2:
-    Convert each column into the same string pattern format.
- 
-    Step 3:
-    If the column pattern exists in the map, add its frequency to the answer.
- 
- Time Complexity:
- O(n^2)
- 
- Space Complexity:
- O(n^2)
*/

import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> map = new HashMap<>();

        // Store all rows as strings in map
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(",");
            }
            String row = sb.toString();
            map.put(row, map.getOrDefault(row, 0) + 1);
        }

        int count = 0;

        // Compare each column with stored rows
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(",");
            }
            String col = sb.toString();
            count += map.getOrDefault(col, 0);
        }

        return count;
    }
}
