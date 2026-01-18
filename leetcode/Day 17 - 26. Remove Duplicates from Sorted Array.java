/**
- LeetCode Journey - Day 19
-
- Problem Name: Remove Duplicates from Sorted Array
- Difficulty: Easy
-
- Problem:
- Given a sorted integer array nums, remove the duplicates in-place
- such that each unique element appears only once and return the
- number of unique elements.
-
- LeetCode Link:
- https://leetcode.com/problems/remove-duplicates-from-sorted-array/
-
- Approach:
-
- Step 1:
- Initialize a slow pointer at index 0 (first element is always unique).
-
- Step 2:
- Use a fast pointer starting from index 1 to traverse the array.
-
- Step 3:
- If nums[fast] is different from nums[slow], move slow forward and
- copy nums[fast] to nums[slow].
-
- Time Complexity:
- O(n) — Traverse the array once
-
- Space Complexity:
- O(1) — In-place, no extra space used
*/

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        // Step 1: Initialize slow pointer
        int slow = 0;

        // Step 2: Traverse array using fast pointer
        for (int fast = 1; fast < nums.length; fast++) {

            // Step 3: Copy only unique elements
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        // Number of unique elements
        return slow + 1;
    }
}
