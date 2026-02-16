/**
- LeetCode Journey - Day 40
-
- Problem Name: Move Zeroes
- Difficulty: Easy
-
- Problem:
- Given an integer array, move all 0's to the end while maintaining
- the relative order of the non-zero elements.
-
- LeetCode Link:
- https://leetcode.com/problems/move-zeroes/
-
- Approach:
-
    - Step 1:
      Use two pointers: `left` to track position of next non-zero,
      and `right` to scan the array.

    - Step 2:
      Traverse the array with `right`.  
      When nums[right] is not zero, swap it with nums[left].

    - Step 3:
      Increment `left` after every successful swap.
      This pushes all non-zero elements forward and zeros automatically go to the end.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
*/

import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
