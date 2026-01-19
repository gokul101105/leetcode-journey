/**
- LeetCode Journey - Day 18
- 
- Problem Name: Maximum Subarray
- Difficulty: Medium
- 
- Problem:
- Find the contiguous subarray (containing at least one number)
- which has the largest sum and return its sum.
- 
- LeetCode Link:
- https://leetcode.com/problems/maximum-subarray/
- 
- Approach:
- 
    - Step 1:
      Initialize current sum and maximum sum with the first element.
- 
    - Step 2:
      Traverse the array and at each index decide whether to
      start a new subarray or continue the existing one.
- 
    - Step 3:
      Update the maximum sum whenever current sum is greater.
- 
- Time Complexity: O(n)
- Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
