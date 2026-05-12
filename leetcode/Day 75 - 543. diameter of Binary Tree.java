/**
 * LeetCode Journey - Day 75
 * 
 * Problem Name: Diameter of Binary Tree
 * Difficulty: Easy
 *   
 * Problem:
 * Given the root of a binary tree, return the length   
 * of the diameter of the tree.
 * 
 * The diameter of a binary tree is the length of the
 * longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 * 
 * The length of a path between two nodes is represented
 * by the number of edges between them.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Create a global variable 'res'
 *      to store maximum diameter.
 * 
 *    - Step 2:
 *      Start DFS traversal from root.
 * 
 *    - Step 3:
 *      In DFS function:
 * 
 *          - If node is null,
 *            return 0.
 * 
 *    - Step 4:
 *      Recursively find left subtree height.
 * 
 *    - Step 5:
 *      Recursively find right subtree height.
 * 
 *    - Step 6:
 *      Current diameter passing through node is:
 * 
 *          leftHeight + rightHeight
 * 
 *      Update maximum diameter.
 * 
 *    - Step 7:
 *      Return height of current node:
 * 
 *          1 + max(leftHeight, rightHeight)
 * 
 *    - Step 8:
 *      Return final diameter stored in 'res'.
 * 
 * Time Complexity:
 * O(n)  // Each node visited once
 * 
 * Space Complexity:
 * O(h)  // Recursive call stack height
 */

class Solution {

    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        dfs(root);

        return res;
    }

    private int dfs(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int lef = dfs(root.left);

        int rig = dfs(root.right);

        res = Math.max(res, lef + rig);

        return 1 + Math.max(lef, rig);
    }
}
