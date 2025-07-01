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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean a = false;
        boolean b = false;
        boolean c = false;

        if (p == null && q == null) {
            return true;
        } else {
            // ✅ Added missing condition
            if (p == null || q == null) {
                return false;
            }

            if (p.val == q.val) {
                a = true;

                if (p.left != null && q.left != null) {
                    b = isSameTree(p.left, q.left);
                } else if (p.left == null && q.left == null) {
                    b = true;
                } else {
                    b = false;
                }

                if (p.right != null && q.right != null) {
                    c = isSameTree(p.right, q.right);
                } else if (p.right == null && q.right == null) {
                    c = true;
                } else {
                    c = false;
                }

                return a && b && c;
            } else {
                return false;
            }
        }
    }
}
