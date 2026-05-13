/**
 * LeetCode Journey - Day 76
 * 
 * Problem Name: Binary Tree Right Side View
 * Difficulty: Medium
 *   
 * Problem:
 * Given the root of a binary tree, imagine yourself
 * standing on the right side of it.
 * 
 * Return the values of the nodes you can see
 * ordered from top to bottom.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/binary-tree-right-side-view/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Create an empty list 'result'
 *      to store right side view nodes.
 * 
 *    - Step 2:
 *      Start DFS traversal from root
 *      with level = 0.
 * 
 *    - Step 3:
 *      In DFS function:
 * 
 *          - If node is null,
 *            return.
 * 
 *    - Step 4:
 *      If current level equals
 *      result size,
 * 
 *      it means this is the first
 *      node visited at this level.
 * 
 *      Add node value to result.
 * 
 *    - Step 5:
 *      Traverse right subtree first.
 * 
 *      This ensures rightmost node
 *      is visited before left node.
 * 
 *    - Step 6:
 *      Traverse left subtree.
 * 
 *    - Step 7:
 *      Continue recursion for all levels.
 * 
 *    - Step 8:
 *      Return final result list.
 * 
 * Time Complexity:
 * O(n)  // Each node visited once
 * 
 * Space Complexity:
 * O(h)  // Recursive call stack height
 */

class Solution {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        rightView(root, result, 0);

        return result;
    }

    private void rightView(TreeNode root, List<Integer> result, int level) {

        if(root == null) {
            return;
        }

        if(level == result.size()) {
            result.add(root.val);
        }

        rightView(root.right, result, level + 1);

        rightView(root.left, result, level + 1);
    }
}
