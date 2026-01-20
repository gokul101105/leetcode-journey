/**
- LeetCode Journey - Day 19
- 
- Problem Name: Container With Most Water
- Difficulty: Medium
- 
- Problem:
- Given an array of heights, find two lines that together with the x-axis form a container, such that the container contains the most water.
- 
- LeetCode Link:
- https://leetcode.com/problems/container-with-most-water/
- 
- Approach (Simple):
- 
    - Step 1: Start with two pointers, one at the beginning (left) and one at the end (right) of the array.
- Step 2: Calculate the area formed by the lines at left and right.
- Step 3: Keep track of the maximum area.
- Step 4: Move the pointer pointing to the smaller height, repeat until pointers meet.
- 
- Time Complexity: O(n) – we scan each element at most once.
- Space Complexity: O(1) – no extra space needed.
*/

import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);

            // Move the smaller height pointer inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
