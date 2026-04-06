/**

- LeetCode Journey - Day 60
- 
- Problem Name: First Unique Character in a String
- Difficulty: Easy
- 
- Problem:
- Given a string `s`, return the index of the first non-repeating character.
- If every character repeats, return `-1`.
- 
- LeetCode Link:
- https://leetcode.com/problems/first-unique-character-in-a-string/
- 
- Approach:
- 
- Step 1:
- Use a HashMap to count the frequency of each character in the string.
- 
- Step 2:
- Traverse the string again from left to right.
- 
- Step 3:
- Return the index of the first character whose frequency is `1`.
- If no such character exists, return `-1`.
- 
- Time Complexity:
- O(n)
- 
- Space Complexity:
- O(1) 
- (Because at most 26 lowercase English letters are stored, otherwise O(n) in general)

*/

import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }
}
