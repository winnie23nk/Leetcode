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
    public void flatten(TreeNode root) {
        if(root==null) return;
         TreeNode prev=root;
        while(prev!=null){
            if(prev.left!=null){
                TreeNode curr=prev.left;
                while(curr.right!=null){
                    curr=curr.right;
                }
                curr.right=prev.right;
                prev.right=prev.left;
                prev.left=null;
            
            
            }
           
            prev=prev.right;
            
        }
       
        
    }
}