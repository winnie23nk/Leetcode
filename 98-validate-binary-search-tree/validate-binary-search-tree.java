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
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    public boolean valid(TreeNode root,long min, long max){
        if(root==null){
            return true;
        }
        if(min>=root.val||root.val>=max){
            return false;
        }
        return valid(root.left,min,root.val)&&valid(root.right,root.val,max);

    }
}