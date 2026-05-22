/**
 * LeetCode Journey - Day 78
 * 
 * Problem Name:
 * Binary Tree Maximum Path Sum
 * 
 * Difficulty:
 * Hard
 * 
 * Problem:
 * A path in a binary tree is a sequence of nodes
 * where each pair of adjacent nodes has an edge
 * connecting them.
 * 
 * A node can appear only once in the path.
 * 
 * The path does not need to pass through the root.
 * 
 * Return the maximum path sum of any path.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Use DFS recursion to calculate the
 *      maximum gain from each subtree.
 * 
 *    - Step 2:
 *      Create a global variable 'res'
 *      to store the maximum path sum.
 * 
 *    - Step 3:
 *      If node is null,
 *      return 0.
 * 
 *    - Step 4:
 *      Recursively calculate:
 * 
 *          - left subtree gain
 *          - right subtree gain
 * 
 *    - Step 5:
 *      Ignore negative paths using:
 * 
 *          Math.max(0, subtreeSum)
 * 
 *      Because negative paths reduce
 *      the total path sum.
 * 
 *    - Step 6:
 *      Calculate current path sum:
 * 
 *          leftGain + rightGain + root.val
 * 
 *      This represents a path passing
 *      through the current node.
 * 
 *    - Step 7:
 *      Update global maximum result.
 * 
 *    - Step 8:
 *      Return the maximum single path:
 * 
 *          max(leftGain, rightGain) + root.val
 * 
 *      Because parent can continue
 *      only through one side.
 * 
 * Time Complexity:
 * O(n)  // Visit every node once
 * 
 * Space Complexity:
 * O(h)  // Recursive call stack
 *        // h = height of tree
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

    int res;

    public int maxPathSum(TreeNode root) {

        // Initialize result with root value
        res = root.val;

        dfs(root);

        return res;
    }

    private int dfs(TreeNode root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Maximum gain from left subtree
        int leftSum = Math.max(0, dfs(root.left));

        // Maximum gain from right subtree
        int rightSum = Math.max(0, dfs(root.right));

        // Path passing through current node
        int currentPath = leftSum + rightSum + root.val;

        // Update global maximum
        res = Math.max(res, currentPath);

        // Return single path to parent
        return Math.max(leftSum, rightSum) + root.val;
    }
}
