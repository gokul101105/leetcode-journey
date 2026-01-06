/**
- LeetCode Journey - Day 5
-
- Problem Name: Valid Perfect Square
- Difficulty: Easy
-
- Problem:
- Given a positive integer num, return true if num is a perfect square,
- otherwise return false. Do not use any built-in square root function.
-
- LeetCode Link:
- https://leetcode.com/problems/valid-perfect-square/
-
- Approach:
-
- Step 1:
- If the number is 1, it is already a perfect square, so return true.
-
- Step 2:
- Use Binary Search between 1 and num/2 to find a number whose square
- is equal to num.
-
- Step 3:
- Calculate mid * mid and compare it with num:
-   - If equal → perfect square → return true
-   - If greater → move to left half
-   - If smaller → move to right half
-
- Time Complexity:
- O(log n) — Binary search reduces the range each time
-
- Space Complexity:
- O(1) — No extra space used
*/

import java.util.*;

class Solution {
    public boolean isPerfectSquare(int num) {

        // Step 1: Base case
        if (num == 1) {
            return true;
        }

        int left = 1;
        int right = num / 2;

        // Step 2: Binary Search
        while (left <= right) {
            int mid = (left + right) / 2;
            long square = (long) mid * mid;

            // Step 3: Compare square with num
            if (square == num) {
                return true;
            } else if (square > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
