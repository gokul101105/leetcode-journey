/**
 * 
 * - LeetCode Journey - Day 21
 * 
 * - Problem Name: Gas Station
 * - Difficulty: Medium
 * 
 * - Problem:
 *   Given two integer arrays gas and cost, return the starting gas station’s
 *   index if you can travel around the circuit once in the clockwise direction.
 *   Otherwise, return -1.
 * 
 * - LeetCode Link:
 *   https://leetcode.com/problems/gas-station/
 * 
 * - Approach:
 * 
 *   - Step 1:
 *     Traverse all stations and calculate fuelGain = gas[i] - cost[i].
 * 
 *   - Step 2:
 *     Maintain totalGas to check overall feasibility and currentGas to track
 *     fuel while traversing.
 * 
 *   - Step 3:
 *     If currentGas drops below 0, reset it and set the next station as a new
 *     starting point.
 * 
 * - Time Complexity:
 *   O(n)
 * 
 * - Space Complexity:
 *   O(1)
 * 
 */

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int totalGas = 0;
        int currentGas = 0;

        for (int i = 0; i < gas.length; i++) {
            int fuelGain = gas[i] - cost[i];
            totalGas += fuelGain;
            currentGas += fuelGain;

            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return totalGas < 0 ? -1 : start;        
    }
}
