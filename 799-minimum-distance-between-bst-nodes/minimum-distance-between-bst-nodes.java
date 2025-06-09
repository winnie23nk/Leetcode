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
     int prev=100001;
     int min=100001;
    public int minDiffInBST(TreeNode root) {
         return inorder(root);
        
    }
     public int inorder(TreeNode root){
        if(root==null){
            return 0;
        }
        inorder(root.left);
        int curr=root.val;
        if(Math.abs(prev-curr)<min){
            min=Math.abs(prev-curr);
        }
        prev=curr;
        inorder(root.right);
        return min;
     }
}