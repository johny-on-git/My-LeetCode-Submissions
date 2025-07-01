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
    public List<Integer> inorderTraversal(TreeNode root) {

        return inOrder(root);
        
    }

    public List<Integer> inOrder(TreeNode rut)
    {   int root = -101;
        List<Integer> inOrder = new ArrayList<Integer>();
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        if( null != rut )
        {
            root = rut.val;
        }

        if( null != rut &&  null != rut.left)
        {
                left = inOrder(rut.left);
        }
        //List<Integer> ownInOrder =  inorderTraversal(rut);

        if(null != rut && null != rut.right)
        {
                right =  inOrder(rut.right);
        }
            for(int i : left)
            {
                if(i!= -101)
                {
                   inOrder.add(i); 
                }
            }
           // inOrder.addAll(left);
           if(root != -101)
           {
                inOrder.add(root);
           }
            
            for(int i : right)
            {
                if(i!= -101)
                {
                   inOrder.add(i); 
                }
            }
            //inOrder.addAll(right);
        
    return inOrder;



    }
    
}