/**
 * 
 * - LeetCode Journey - Day 57
 * 
 * - Problem Name: Asteroid Collision
 * - Difficulty: Medium
 * 
 * - Problem:
 *   We are given asteroids moving in a line, where positive values move right 
 *   and negative values move left. When two asteroids collide, the smaller one
 *   explodes. Return the state of the asteroids after all collisions.
 * 
 * - LeetCode Link:
 *   https://leetcode.com/problems/asteroid-collision/
 * 
 * - Approach:
 * 
 *   - Step 1:
 *     Use a stack to keep track of asteroids that are still alive.
 * 
 *   - Step 2:
 *     For each asteroid, if it is moving left (negative) and the top of the stack
 *     is moving right (positive), then a collision may happen.
 * 
 *   - Step 3:
 *     Compare sizes:
 *       - If current asteroid is bigger, pop the stack and continue checking.
 *       - If both are equal, pop the stack and destroy current asteroid too.
 *       - If stack top is bigger, current asteroid gets destroyed.
 * 
 *   - Step 4:
 *     If the current asteroid survives all collisions, push it into the stack.
 * 
 *   - Step 5:
 *     Convert the stack into the result array in correct order.
 * 
 * - Time Complexity:
 *   O(n)
 * 
 * - Space Complexity:
 *   O(n)
 * 
 */

import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(asteroid) > stack.peek()) {
                    stack.pop();
                    continue;
                } else if (Math.abs(asteroid) == stack.peek()) {
                    stack.pop();
                }

                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
}
