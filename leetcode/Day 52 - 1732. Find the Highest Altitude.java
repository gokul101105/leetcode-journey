/**

- LeetCode Journey - Day 52
-     
- Problem Name: Find the Highest Altitude
- Difficulty: Easy
- 
- Problem:
- A biker starts at altitude 0. Given an integer array gain where gain[i] is the net gain in altitude between points, return the highest altitude reached.
- 
- LeetCode Link:
- https://leetcode.com/problems/find-the-highest-altitude/
- 
- Approach:
- 
    - Step 1:
      Start with current altitude = 0 because the biker starts at altitude 0.
- 
    - Step 2:
      Traverse the gain array and keep adding gain[i] to current altitude.
- 
    - Step 3:
      After updating the current altitude, compare it with the maximum altitude and update the maximum if needed.
- 
- Time Complexity: O(n)
- Space Complexity: O(1)

*/

import java.util.*;

class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0;
        int curr = 0;

        for(int i = 0; i < gain.length; i++) {
            curr = curr + gain[i];
            max = Math.max(curr, max);
        }

        return max;
    }
}
