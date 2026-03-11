/**

- LeetCode Journey - Day 50
- 
- Problem Name: Max Consecutive Ones III
- Difficulty: Medium
- 
- Problem:
- Given a binary array nums and an integer k, return the maximum number of 
- consecutive 1's in the array if you can flip at most k 0's.
- 
- LeetCode Link:
- https://leetcode.com/problems/max-consecutive-ones-iii/
- 
- Approach: Sliding Window
- 
    - Step 1:
      Use two pointers (l and r) to create a sliding window.

    - Step 2:
      Expand the window by moving r. If nums[r] is 0, increase zero count.

    - Step 3:
      If zero count becomes greater than k, shrink the window from the left
      by moving l until zero count becomes valid again.

    - Step 4:
      Update maxlen using the current window size (r - l + 1).

- Time Complexity: O(n)
- Space Complexity: O(1)

*/

import java.util.*;

class Solution {
    public int longestOnes(int[] nums, int k) {

        int r = 0;
        int l = 0;
        int maxlen = 0;
        int zero = 0;

        while (r < nums.length) {

            if (nums[r] == 0) {
                zero++;
            }

            if (zero > k) {
                if (nums[l] == 0) {
                    zero--;
                }
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);

            r++;
        }

        return maxlen;
    }
}
