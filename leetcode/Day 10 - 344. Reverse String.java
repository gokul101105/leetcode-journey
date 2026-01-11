/**
- LeetCode Journey - Day 10
-
- Problem Name: Reverse String
- Difficulty: Easy
-
- Problem:
- Given a character array s, reverse the array in-place using O(1) extra space.
-
- LeetCode Link:
- https://leetcode.com/problems/reverse-string/
-
- Approach:
-
- Step 1:
- Use two pointers: one at the beginning (left) and one at the end (right).
-
- Step 2:
- Swap the characters at left and right positions.
-
- Step 3:
- Move left forward and right backward until they meet.
-
- Time Complexity:
- O(n) — each character is visited once.
-
- Space Complexity:
- O(1) — no extra memory is used.
*/

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
