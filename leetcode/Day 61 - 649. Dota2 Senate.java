/**
 * LeetCode Journey - Day 61
 * 
 * Problem Name: Dota2 Senate 
 * Difficulty: Medium
 * 
 * Problem:
 * In the Dota2 senate, each senator can ban one senator from the opposite party. 
 * Predict which party will finally win if all senators act optimally.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/dota2-senate/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Add all senators into a queue to simulate the round-by-round voting process.
 * 
 *    - Step 2:
 *      Use a variable `toBan`:
 *      - Positive value means Radiant has pending bans on Dire senators.
 *      - Negative value means Dire has pending bans on Radiant senators.
 * 
 *    - Step 3:
 *      Process senators one by one:
 *      - If the current senator is already banned, remove them.
 *      - Otherwise, they survive, add a future ban against the opposite party,
 *        and move them to the back of the queue for the next round.
 *      Continue until only one party remains.
 * 
 * Time Complexity: O(n^2) in worst case
 * Space Complexity: O(n)
 */

import java.util.*;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> q = new LinkedList<Character>();

        for (char c : senate.toCharArray()) {
            q.offer(c);
        }

        int toBan = 0;

        while (q.size() > Math.abs(toBan)) {
            if (toBan > 0 && q.peek() == 'D') {
                q.poll();
                toBan -= 1;
            } 
            else if (toBan < 0 && q.peek() == 'R') {
                q.poll();
                toBan += 1;
            } 
            else {
                toBan += q.peek() == 'R' ? 1 : -1;
                q.offer(q.poll());
            }
        }

        return toBan > 0 ? "Radiant" : "Dire";
    }
}
