/**
- LeetCode Journey - Day 32
-
- Problem Name:
- Remove Duplicates from Sorted Array II
-
- Difficulty:
- Medium
-
- Problem:
- Given a sorted integer array `nums`, remove duplicates in-place such that each element appears at most twice.
- Return the new length `k` after modifying the array.
-
- LeetCode Link:
- https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
-
- Approach:
-
    - Step 1:
      Since the array is sorted, duplicates will be adjacent.
      We are allowed to keep at most 2 occurrences of each number.
-
    - Step 2:
      Initialize `k = 2` because the first two elements can always stay.
-
    - Step 3:
      Traverse the array from index `2` onward.
      If `nums[i] != nums[k-2]`, copy `nums[i]` to `nums[k]` and increment `k`.
-
- Time Complexity:
- O(n)
-
- Space Complexity:
- O(1)
*/

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
