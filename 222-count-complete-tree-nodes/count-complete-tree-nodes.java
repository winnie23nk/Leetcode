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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lc=1;
        TreeNode leftnode=root;
        while(leftnode.left!=null){
            lc++;
            leftnode=leftnode.left;
        }
        int rc=1;
        TreeNode rightnode=root;
        while(rightnode.right!=null){
            rc++;
            rightnode=rightnode.right;
        }
        if(lc==rc){
            return (int)Math.pow(2,lc)-1;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
        
    }
}