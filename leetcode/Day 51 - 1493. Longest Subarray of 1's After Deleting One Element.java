/**

- LeetCode Journey - Day 50
- 
- Problem Name: Longest Subarray of 1's After Deleting One Element
- Difficulty: Medium
- 
- Problem:
- Given a binary array nums, return the length of the longest subarray containing only 1's 
- after deleting exactly one element.
- 
- LeetCode Link:
- https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
- 
- Approach:
- 
    - Step 1:
      Use the Sliding Window (Two Pointer) technique.

    - Step 2:
      Expand the right pointer `r`. If we encounter a `0`, increase the zero count.

    - Step 3:
      If zero count becomes greater than 1, shrink the window from the left pointer `l`
      until the window contains at most one zero.

    - Step 4:
      Update the result using `r - l`. This automatically simulates deleting one element.

- Time Complexity:
- O(n)

- Space Complexity:
- O(1)
*/

import java.util.*;

class Solution {
    public int longestSubarray(int[] nums) {

        int l = 0;
        int zero = 0;
        int res = 0;

        for(int r = 0; r < nums.length; r++){

            if(nums[r] == 0){
                zero++;
            }

            if(zero > 1){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }

            res = Math.max(res , r - l);
        }

        return res;
    }
}
