/**
- LeetCode Journey - Day 6
-
- Problem Name: Climbing Stairs
- Difficulty: Easy
-
- Problem:
- You are climbing a staircase with n steps.
- Each time you can climb either 1 or 2 steps.
- Return the number of distinct ways to reach the top.
-
- LeetCode Link:
- https://leetcode.com/problems/climbing-stairs/
-
- Approach:
-
- Step 1:
- If n is 1 or 2, return n directly because:
-   - 1 step → 1 way
-   - 2 steps → 2 ways
-
- Step 2:
- Store the number of ways to reach the first two steps:
-   - prev2 = ways to reach step 1
-   - prev1 = ways to reach step 2
-
- Step 3:
- For each step from 3 to n:
-   - Current ways = ways of previous step + ways of two steps before
-   - Update prev2 and prev1 for the next iteration
-
- Step 4:
- After the loop ends, prev1 contains the number of ways to reach step n.
-
- Time Complexity:
- O(n) — Each step is calculated once
-
- Space Complexity:
- O(1) — Only constant extra space is used
*/

class Solution {
    public int climbStairs(int n) {

        // Step 1: Base cases
        if (n <= 2) {
            return n;
        }

        // Step 2: Initial values
        int prev2 = 1; // Ways to reach step 1
        int prev1 = 2; // Ways to reach step 2

        // Step 3: Calculate ways for each step
        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        // Step 4: Final answer
        return prev1;
    }
}
