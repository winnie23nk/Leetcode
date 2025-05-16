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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        
        return checksym(root.left,root.right);
        
    }
    public boolean checksym(TreeNode left, TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null||left.val!=right.val) return false;
        return checksym(left.left,right.right)&&checksym(left.right,right.left);
    }
}