/**
- LeetCode Journey - Day 31
-
- Problem Name:
- Remove Element
-
- Difficulty:
- Easy
-
- Problem:
- Given an integer array nums and an integer val, remove all occurrences of val in-place
- and return the number of elements remaining. Order can be changed.
-
- LeetCode Link:
- https://leetcode.com/problems/remove-element/
-
- Approach:
- Use two pointers to overwrite elements equal to val.
-
    - Step 1:
    - Initialize pointer j = 0 to track position of valid elements.
-
    - Step 2:
    - Traverse array using pointer i.
    - If nums[i] != val, copy nums[i] to nums[j] and increment j.
-
    - Step 3:
    - After traversal, j represents the new length of array.
-
- Time Complexity:
- O(n)
-
- Space Complexity:
- O(1)
*/

import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
