/**

- LeetCode Journey - Day 53  
-  
- Problem Name:
- Find Pivot Index
- Difficulty:
- Easy
- 
- Problem:
- Find the index where the sum of all elements to the left is equal to the sum of all elements to the right.
- Return that index, or -1 if no such index exists.
- 
- LeetCode Link:
- https://leetcode.com/problems/find-pivot-index/
- 
- Approach:
- 
    - Step 1:
- First, calculate the total sum of the entire array.
- 
    - Step 2:
- Traverse the array while maintaining a left-side sum (`leftTotal`).
- For each index, calculate the right-side sum using:
- `rightTotal = total - leftTotal - nums[i]`
- 
    - Step 3:
- If `leftTotal == rightTotal`, return the current index because it is the pivot index.
- Otherwise, add the current element to `leftTotal` and continue.
- 
- Time Complexity:
- O(n)
- 
- Space Complexity:
- O(1)
*/

import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        // Step 1: Find total sum of array
        for (int num : nums) {
            total += num;
        }

        int leftTotal = 0;

        // Step 2: Traverse and check pivot index
        for (int i = 0; i < nums.length; i++) {
            int rightTotal = total - leftTotal - nums[i];

            // Step 3: Check if left sum equals right sum
            if (rightTotal == leftTotal) {
                return i;
            }

            leftTotal += nums[i];
        }

        return -1;
    }
}
