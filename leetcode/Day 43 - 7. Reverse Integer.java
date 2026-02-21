/**
 - LeetCode Journey - Day 43
 -
 - Problem Name: Reverse Integer
 - Difficulty: Medium
 -
 - Problem:
 - Given a signed 32-bit integer x, return x with its digits reversed.
 - If reversing x causes it to go outside the 32-bit signed integer range, return 0.
 -
 - LeetCode Link:
 - https://leetcode.com/problems/reverse-integer/
 -
 - Approach:
 -
     - Step 1:
       Extract the last digit using x % 10.
 
     - Step 2:
       Before adding the digit to the reversed number, check for overflow:
       • If reverse > Integer.MAX_VALUE/10 → overflow
       • If reverse < Integer.MIN_VALUE/10 → underflow
 
     - Step 3:
       Update reverse = reverse * 10 + digit.
       Continue until x becomes 0.
 
 - Time Complexity:
 - O(log10(n)) → Number of digits in the integer.
 
 - Space Complexity:
 - O(1) → No extra space used.
*/

import java.util.*;

class Solution {
    public int reverse(int x) {

        int reverse = 0;

        while (x != 0) {

            int digit = x % 10;
            x = x / 10;

            // Check for overflow (positive side)
            if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Check for overflow (negative side)
            if (reverse < Integer.MIN_VALUE / 10 ||
                (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reverse = (reverse * 10) + digit;
        }

        return reverse;
    }
}
