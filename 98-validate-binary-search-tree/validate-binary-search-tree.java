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
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
         if(righttree(root.right,root)&&lefttree(root.left,root)){
            return isValidBST(root.left)&&isValidBST(root.right);
         }

        return false;
    }
    public boolean righttree(TreeNode root,TreeNode megaroot){
        if(root==null){
            return true;
        }
        if(root.val<=megaroot.val){
            return false;
        }
        boolean left=righttree(root.left,megaroot);
        boolean right=righttree(root.right,megaroot);
        return left&&right;

    }
     public boolean lefttree(TreeNode root,TreeNode megaroot){
        if(root==null){
            return true;
        }
        if(root.val>=megaroot.val){
            return false;
        }
        boolean left=lefttree(root.left,megaroot);
        boolean right=lefttree(root.right,megaroot);
        return left&&right;

    }
}