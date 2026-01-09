/**
-
- LeetCode Journey - Day 8
- 
- Problem Name: Check If N and Its Double Exist
- Difficulty: Easy
- 
- Problem:
- Given an integer array arr, check if there exist two indices i and j
- such that i != j, arr[i] == 2 * arr[j].
- 
- LeetCode Link:
- https://leetcode.com/problems/check-if-n-and-its-double-exist/
- 
- Approach (Simple HashSet):
- 
- Step 1:
- Create a HashSet to store visited numbers.
- 
- Step 2:
- Traverse the array one by one.
- 
- Step 3:
- For each element, check if its double or half already exists in the set.
- 
- Step 4:
- If found, return true.
- 
- Step 5:
- Otherwise, add the element to the set.
- 
- Time Complexity:
- O(n)
- 
- Space Complexity:
- O(n)
*/

import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
