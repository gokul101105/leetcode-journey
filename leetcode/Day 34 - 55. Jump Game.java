/**

- LeetCode Journey - Day 34
- 
- Problem Name: Jump Game
- Difficulty: Medium 
- 
- Problem:
- Given an array where each element represents your maximum jump length at that position,
- determine if you can reach the last index starting from the first index.
- 
- LeetCode Link:
- https://leetcode.com/problems/jump-game/
- 
- Approach:
- 
    - Step 1:
- Initialize a variable `maxReach` to track the farthest index we can reach.
- 
    - Step 2:
- Traverse the array. If the current index `i` is greater than `maxReach`,
- it means we cannot reach this position → return false.
- 
    - Step 3:
- Update `maxReach = max(maxReach, i + nums[i])` at each step.
- If traversal completes, return true.
- 
- Time Complexity:
- O(n) – We traverse the array once.
- 
- Space Complexity:
- O(1) – Only one variable is used.
*/

import java.util.*;

class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for(int i = 0; i < nums.length; i++){
            if(i > maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}
