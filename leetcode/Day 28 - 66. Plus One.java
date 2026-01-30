/**
- LeetCode Journey - Day 28
-
- Problem Name: Plus One
- Difficulty: Easy
-
- Problem:
- Given a non-empty array of digits representing a non-negative integer,
- add one to the integer and return the resulting array of digits.
-
- LeetCode Link:
- https://leetcode.com/problems/plus-one/
-
- Approach:
-
    - Step 1:
      Start from the last digit (rightmost) and move left.
-
    - Step 2:
      If the current digit is less than 9, increment it by 1 and return the array.
-
    - Step 3:
      If the digit becomes 10, set it to 0 and continue.
      If all digits are 9, create a new array with size +1 and set first element to 1.
-
- Time Complexity: O(n)
- Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
