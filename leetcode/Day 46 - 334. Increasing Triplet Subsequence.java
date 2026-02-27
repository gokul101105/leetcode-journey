/**
 
- LeetCode Journey - Day 46
- 
- Problem Name: Increasing Triplet Subsequence 
- Difficulty: Medium
- 
- Problem:
- Given an integer array nums, return true if there exists 
- a triplet (i < j < k) such that nums[i] < nums[j] < nums[k].
- Otherwise, return false.
- 
- LeetCode Link:
- https://leetcode.com/problems/increasing-triplet-subsequence/
- 
- Approach:
- 
    - Step 1:
      Initialize two variables:
      a = smallest value seen so far
      b = second smallest value seen so far
      (Initialize both to Integer.MAX_VALUE)
 
    - Step 2:
      Traverse through the array:
        - If current number <= a → update a
        - Else if current number <= b → update b
 
    - Step 3:
      If we find a number greater than both a and b,
      then we found a < b < current → return true
 
      If loop ends without finding such triplet → return false
 
- Time Complexity:
  O(n)  → Single pass through array
 
- Space Complexity:
  O(1)  → Only two extra variables used
 
*/

import java.util.*;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= a) {
                a = n;
            } 
            else if (n <= b) {
                b = n;
            } 
            else {
                return true;
            }
        }
        return false;
    }
}
