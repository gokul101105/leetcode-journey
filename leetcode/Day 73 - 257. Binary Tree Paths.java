/**
 * LeetCode Journey - Day 73
 * 
 * Problem Name: Binary Tree Paths
 * Difficulty: Easy
 *   
 * Problem:
 * Given the root of a binary tree, return all root-to-leaf paths 
 * in any order.
 * 
 * A leaf is a node with no children.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/binary-tree-paths/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Create a result list to store all paths.
 * 
 *    - Step 2:
 *      Start DFS traversal from root with an empty path string.
 * 
 *    - Step 3:
 *      If the current node is null, return.
 * 
 *    - Step 4:
 *      Add current node value to the path.
 * 
 *    - Step 5:
 *      If the node is a leaf (left == null && right == null),
 *      add the path to the result list.
 * 
 *    - Step 6:
 *      Otherwise, add "->" to path and recursively call
 *      DFS for left and right subtree.
 * 
 * Time Complexity:
 * O(n)  // Each node visited once
 * 
 * Space Complexity:
 * O(h)  // Recursion stack (height of tree)
 */

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, "", res);
        return res;
    }

    public void dfs(TreeNode root, String path, List<String> res){
        if(root == null) return;

        path += root.val;

        if(root.left == null && root.right == null){
            res.add(path);
        }
        else{
            path += "->";
            dfs(root.left, path, res);
            dfs(root.right, path, res);
        }
    }
}
