/**
- LeetCode Journey - Day 29
-
- Problem Name: Add Binary
- Difficulty: Easy
-
- Problem:
- Given two binary strings a and b, return their sum as a binary string.
-
- LeetCode Link:
- https://leetcode.com/problems/add-binary/
-
- Approach:
-
    - Step 1:
      Start from the last characters of both strings and initialize carry as 0.
-
    - Step 2:
      Add corresponding bits from both strings along with carry.
      Append (sum % 2) to the result.
-
    - Step 3:
      Update carry as (sum / 2) and continue until all bits and carry are processed.
      Reverse the result at the end.
-
- Time Complexity: O(n)
- Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public String addBinary(String a, String b) {
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        int i = arrayA.length - 1;
        int j = arrayB.length - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int num1 = i >= 0 ? arrayA[i] - '0' : 0;
            int num2 = j >= 0 ? arrayB[j] - '0' : 0;
            
            int sum = num1 + num2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            
            i--;
            j--;
        }
        
        return sb.reverse().toString();
    }
}
