/**
 * LeetCode Journey - Day 59
 * 
 * Problem Name: Number of Recent Calls
 * Difficulty: Easy
 * 
 * Problem:
 * Design a class that counts the number of recent requests in the last 3000 milliseconds. 
 * For each ping(t), return how many requests happened in the range [t - 3000, t].
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/number-of-recent-calls/
 * 
 * Approach:
 * 
 * - Step 1:
 *   Use a Queue to store all ping times in the order they arrive.
 * 
 * - Step 2:
 *   Whenever ping(t) is called, add the current time t into the queue.
 * 
 * - Step 3:
 *   Remove all times from the front of the queue that are older than (t - 3000),
 *   because they are outside the valid range [t - 3000, t].
 * 
 * - Step 4:
 *   The remaining elements in the queue represent recent calls, so return queue size.
 * 
 * Time Complexity:
 * O(1) amortized per ping()
 * 
 * Space Complexity:
 * O(n)
 */

import java.util.*;

class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        q.offer(t);

        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.poll();
        }

        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
