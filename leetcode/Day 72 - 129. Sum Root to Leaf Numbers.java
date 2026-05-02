/**
 * LeetCode Journey - Day 72
 * 
 * Problem Name: Sum Root to Leaf Numbers
 * Difficulty: Medium
 *   
 * Problem:
 * You are given the root of a binary tree containing digits from 0 to 9 only.
 * Each root-to-leaf path represents a number.
 * 
 * Return the total sum of all root-to-leaf numbers.
 * 
 * A leaf is a node with no children.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      If the current node is null, return 0.
 * 
 *    - Step 2:
 *      Update pathSum by multiplying current value by 10
 *      and adding current node's value.
 * 
 *    - Step 3:
 *      Check if the current node is a leaf node
 *      (left == null && right == null).
 * 
 *    - Step 4:
 *      If it is a leaf node, return the pathSum.
 * 
 *    - Step 5:
 *      Recursively calculate the sum of left subtree.
 * 
 *    - Step 6:
 *      Recursively calculate the sum of right subtree.
 * 
 *    - Step 7:
 *      Return the sum of left and right subtree results.
 * 
 * Time Complexity:
 * O(n)  // Each node visited once
 * 
 * Space Complexity:
 * O(h)  // Recursion stack (height of tree)
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int pathSum){
        if(root == null){
            return 0;
        }

        pathSum = pathSum * 10 + root.val;

        if(root.left == null && root.right == null){
            return pathSum;
        }

        return dfs(root.left, pathSum) + dfs(root.right, pathSum);
    }
}
