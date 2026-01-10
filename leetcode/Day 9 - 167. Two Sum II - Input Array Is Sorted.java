/**
- LeetCode Journey - Day 8
- 
- Problem Name: Two Sum II - Input Array Is Sorted
- Difficulty: Easy
- 
- Problem:
- Given a sorted array of integers, find two numbers such that they add up to a specific target.
- Return their 1-based indices.
- 
- LeetCode Link:
- https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
- 
- Approach (Very Simple):
- 
- Step 1:
- Use two pointers: one at the start (left) and one at the end (right).
- 
- Step 2:
- Add the values at left and right pointers.
- 
- Step 3:
- If the sum is equal to target → return indices.
- If the sum is greater than target → move right pointer left.
- If the sum is smaller than target → move left pointer right.
- 
- Time Complexity:
- O(n) → each element is visited once.
- 
- Space Complexity:
- O(1) → no extra space used.
*/

import java.util.*;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } 
            else if (sum > target) {
                right--;
            } 
            else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }
}
