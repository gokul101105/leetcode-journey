/**

- LeetCode Journey - Day 48
- 
- Problem Name: Max Number of K-Sum Pairs   
- Difficulty: Medium
- 
- Problem:
- Given an integer array nums and an integer k, return the maximum number 
- of operations where you pick two numbers whose sum equals k and remove them.
- 
- LeetCode Link:
- https://leetcode.com/problems/max-number-of-k-sum-pairs/
- 
- Approach:
- 
    - Step 1:
      Sort the array so we can use the two-pointer technique efficiently.

    - Step 2:
      Initialize two pointers:
      l = 0 (start of array)
      r = nums.length - 1 (end of array)

    - Step 3:
      Check the sum of nums[l] + nums[r]
        • If sum == k → we found a valid pair.
          Increase count and move both pointers (l++, r--).

        • If sum < k → increase the sum by moving left pointer (l++).

        • If sum > k → decrease the sum by moving right pointer (r--).

      Continue until l < r.

- Time Complexity:
  O(n log n)  → due to sorting

- Space Complexity:
  O(1)  → no extra space used
*/

import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int l = 0;
        int r = nums.length - 1;
        int count = 0;

        while (l < r) {

            if (nums[l] + nums[r] == k) {
                count++;
                l++;
                r--;
            }
            else if (nums[l] + nums[r] < k) {
                l++;
            }
            else {
                r--;
            }
        }

        return count;
    }
}
