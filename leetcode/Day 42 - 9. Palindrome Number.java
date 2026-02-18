/**
- LeetCode Journey - Day 42
-
- Problem Name: Palindrome Number
- Difficulty: Easy
-
- Problem:
- Given an integer x, return true if x is a palindrome, and false otherwise.
-
- LeetCode Link:
- https://leetcode.com/problems/palindrome-number/
-
- Approach:
-
    - Step 1:
        If the number is negative, immediately return false (negative numbers
        cannot be palindromes).
-
    - Step 2:
        Store the original number in a variable (copy).
        Reverse the number digit by digit using modulo (%) and division (/).
-
    - Step 3:
        Compare the reversed number with the original copy.
        If both are equal, return true; otherwise false.
-
- Time Complexity:
    O(n)  // n = number of digits
-
- Space Complexity:
    O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int copy = x;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }

        return copy == reverse;
    }
}
