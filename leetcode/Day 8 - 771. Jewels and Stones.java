/**
- LeetCode Journey - Day 8
-
- Problem Name: Jewels and Stones
- Difficulty: Easy
-
- Problem:
- You are given two strings: jewels and stones.
- Each character in jewels represents a type of jewel.
- Each character in stones represents a stone you have.
- Return the number of stones that are also jewels.
-
- LeetCode Link:
- https://leetcode.com/problems/jewels-and-stones/
-
- Approach (Simple Brute Force):
-
- Step 1:
- Initialize a counter variable to store the number of jewels found.
-
- Step 2:
- Loop through each character in the stones string.
-
- Step 3:
- For each stone character, loop through the jewels string.
-
- Step 4:
- If the stone character matches any jewel character,
- increment the counter.
-
- Step 5:
- After checking all stones, return the counter value.
-
- Time Complexity:
- O(n × m)
- where n = length of stones, m = length of jewels
-
- Space Complexity:
- O(1)
- No extra space used.
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }
}
