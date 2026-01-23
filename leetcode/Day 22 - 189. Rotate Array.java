/**
- LeetCode Journey - Day 23
-
- Problem Name: Rotate Array
- Difficulty: Medium
-
- Problem:
- Given an integer array nums, rotate the array to the right by k steps,
- where k is non-negative.
-
- LeetCode Link:
- https://leetcode.com/problems/rotate-array/
-
- Approach:
- Use array reversal to rotate the array in-place.
-
- Step 1:
- Reduce k using k = k % nums.length.
-
- Step 2:
- Reverse the entire array.
-
- Step 3:
- Reverse the first k elements.
-
- Step 4:
- Reverse the remaining elements.
-
- Time Complexity:
- O(n)
-
- Space Complexity:
- O(1)
*/

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
