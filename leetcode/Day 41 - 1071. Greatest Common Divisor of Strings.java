/**
- LeetCode Journey - Day 41
-
- Problem Name: Greatest Common Divisor of Strings
- Difficulty: Easy
-
- Problem:
- Given two strings str1 and str2, return the largest string x such that
- x divides both str1 and str2.
-
- LeetCode Link:
- https://leetcode.com/problems/greatest-common-divisor-of-strings/
-
- Approach:
-
    - Step 1:
      Check if (str1 + str2) equals (str2 + str1).
      If not equal, no common divisor string exists → return "".
-
    - Step 2:
      Find GCD of lengths of both strings.
-
    - Step 3:
      Return substring of str1 from index 0 to gcd length.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
*/

class Solution {
    public String gcdOfStrings(String str1, String str2) {

        // Step 1: Check concatenation property
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Find GCD of lengths
        int gcd = gcd(str1.length(), str2.length());

        // Step 3: Return prefix of length gcd
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
