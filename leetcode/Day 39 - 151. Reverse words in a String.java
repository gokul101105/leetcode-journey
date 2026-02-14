/**
- LeetCode Journey - Day 39
-
- Problem Name: Reverse Words in a String
- Difficulty: Medium
-
- Problem:
- Given an input string s, reverse the order of the words.
- A word is defined as a sequence of non-space characters.
-
- LeetCode Link:
- https://leetcode.com/problems/reverse-words-in-a-string/
-
- Approach:
-
    - Step 1:
      Split the string using "\\s+" to remove extra spaces and get all words.
-
    - Step 2:
      Traverse the words array from last to first.
-
    - Step 3:
      Append each word to StringBuilder and add space between them.
-
- Time Complexity: O(n)
- Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if(i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}
