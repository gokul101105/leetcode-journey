/**
- LeetCode Journey - Day 35
-
- Problem Name: Roman to Integer
- Difficulty: Easy
-
- Problem:
- Given a Roman numeral string, convert it to an integer.
-
- LeetCode Link:
- https://leetcode.com/problems/roman-to-integer/
-
- Approach:
-
    - Step 1:
      Store Roman symbols and their values in a HashMap.

    - Step 2:
      Traverse the string from left to right.
      If current value < next value, subtract it.
      Otherwise, add it.

    - Step 3:
      Finally, add the value of the last character to result.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
*/

import java.util.*;

class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> hp = new HashMap<>();
        hp.put('I', 1);
        hp.put('V', 5);
        hp.put('X', 10);
        hp.put('L', 50);
        hp.put('C', 100);
        hp.put('D', 500);
        hp.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (hp.get(s.charAt(i)) < hp.get(s.charAt(i + 1))) {
                res -= hp.get(s.charAt(i));
            } else {
                res += hp.get(s.charAt(i));
            }
        }

        return res + hp.get(s.charAt(s.length() - 1));
    }
}
