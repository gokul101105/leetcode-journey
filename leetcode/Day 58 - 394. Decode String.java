/**

- LeetCode Journey - Day 58
- 
- Problem Name: Decode String
- Difficulty: Medium
- 
- Problem:
- Given an encoded string, return its decoded version where k[encoded_string]
- means the encoded_string inside the brackets is repeated exactly k times.
- 
- LeetCode Link:
- https://leetcode.com/problems/decode-string/
- 
- Approach:
- 
-    Step 1:
-    Use a stack to process each character one by one.
- 
-    Step 2:
-    When ']' is found, pop characters until '[' to get the substring,
-    then pop digits to get the repeat count.
- 
-    Step 3:
-    Repeat the substring k times, push it back into the stack,
-    and finally build the result from the stack.
- 
- Time Complexity:
- O(n * k) in the worst case, where n is the length of the string
- and k is the repetition factor due to string expansion.
- 
- Space Complexity:
- O(n) for the stack and output construction.
*/

import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ']') {
                char c;
                String sub = "";
                String k = "";

                // Step 1: Get the substring inside brackets
                while ((c = stack.pop()) != '[') {
                    sub = c + sub;
                }

                // Step 2: Get the number before brackets
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = stack.pop() + k;
                }

                // Step 3: Repeat substring and push back to stack
                sub = sub.repeat(Integer.parseInt(k));
                for (int j = 0; j < sub.length(); j++) {
                    stack.push(sub.charAt(j));
                }

            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
