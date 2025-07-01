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
    public int maxDepth(TreeNode root) {
        int depth = 0;
        int lDepth = 0;
        int rDepth = 0;
        if(root == null)
        {
            depth = 0;
        }
        else
        {   
            if(null != root.left)
            {
                lDepth = maxDepth(root.left);
            }

            if(null != root.right)
            {
                rDepth = maxDepth(root.right);
            }

            depth = Math.max(lDepth,rDepth)+1;
        }
        return depth;
    }
}
