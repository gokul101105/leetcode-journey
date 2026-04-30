/**
 * LeetCode Journey - Day 70
 * 
 * Problem Name: Count Good Nodes in Binary Tree
 * Difficulty: Medium
 *   
 * Problem:
 * Given a binary tree root, a node X in the tree is named "good"
 * if in the path from root to X there are no nodes with a value 
 * greater than X.
 * 
 * Return the number of good nodes in the binary tree.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Initialize a global variable 'res' to store count.
 * 
 *    - Step 2:
 *      Start DFS traversal with initial max = -∞.
 * 
 *    - Step 3:
 *      If node is null, return.
 * 
 *    - Step 4:
 *      If current node value >= max so far,
 *      increment count and update max.
 * 
 *    - Step 5:
 *      Recursively traverse left subtree.
 * 
 *    - Step 6:
 *      Recursively traverse right subtree.
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
    int res = 0;

    public int goodNodes(TreeNode root) {
        getGoodNodes(root, Integer.MIN_VALUE);
        return res;
    }

    public void getGoodNodes(TreeNode root, int max) {
        if (root == null) {
            return;
        }

        if (root.val >= max) {
            max = root.val;
            res++;
        }

        getGoodNodes(root.left, max);
        getGoodNodes(root.right, max);
    }
}
