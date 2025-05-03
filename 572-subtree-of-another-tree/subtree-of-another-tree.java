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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(sameTree(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
       
        
    }
    boolean sameTree(TreeNode actual, TreeNode compare){
        if(actual==null&&compare==null){
            return true;
        }
        if(actual==null||compare==null||actual.val!=compare.val){
            return false;
        }
        return sameTree(actual.left,compare.left)&&sameTree(actual.right,compare.right);
    }
}