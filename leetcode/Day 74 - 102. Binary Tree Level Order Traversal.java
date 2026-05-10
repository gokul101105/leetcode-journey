/**
 * LeetCode Journey - Day 74
 * 
 * Problem Name: Binary Tree Level Order Traversal
 * Difficulty: Medium
 *   
 * Problem:
 * Given the root of a binary tree, return the level order traversal
 * of its nodes' values.
 * 
 * (i.e., from left to right, level by level).
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Create a result list to store all levels.
 * 
 *    - Step 2:
 *      If root is null, return the empty result.
 * 
 *    - Step 3:
 *      Create a queue for BFS traversal.
 * 
 *    - Step 4:
 *      Add root node into the queue.
 * 
 *    - Step 5:
 *      Traverse until queue becomes empty.
 * 
 *    - Step 6:
 *      Store current queue size.
 *      This size represents the number of nodes
 *      present in the current level.
 * 
 *    - Step 7:
 *      Create a list to store current level nodes.
 * 
 *    - Step 8:
 *      Run a loop for 'size' times:
 * 
 *          - Remove node from queue
 *          - Add node value into current level list
 *          - Add left child if it exists
 *          - Add right child if it exists
 * 
 *    - Step 9:
 *      Add current level list into result.
 * 
 *    - Step 10:
 *      Return result after traversal completes.
 * 
 * Time Complexity:
 * O(n)  // Each node visited once
 * 
 * Space Complexity:
 * O(n)  // Queue stores nodes level-wise
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {

            int size = queue.size();

            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                level.add(current.val);

                if(current.left != null)
                    queue.add(current.left);

                if(current.right != null)
                    queue.add(current.right);
            }

            result.add(level);
        }

        return result;
    }
}
