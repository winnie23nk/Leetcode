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
    int maxsum=-1001;
    
    public int maxPathSum(TreeNode root) {
        if(root==null){
            return 0;
        }
         int left=helper(root.left);
         int right=helper(root.right);
          int a=Math.max(left+root.val,right+root.val);
        int b=Math.max(left+right+root.val,root.val);
        int c=Math.max(a,b);
        if(c>maxsum){
            maxsum=c;
        }
         
         return maxsum;

        
    }
    public int helper(TreeNode root){
        if(root==null){
            return -1001;
        }
       
        int left=helper(root.left);
        int right=helper(root.right);
        int a=Math.max(left+root.val,right+root.val);
        int c=Math.max(a,root.val);
        if(maxsum<c){
            maxsum=c;
        }
        if(maxsum<left+right+root.val){
            maxsum=left+right+root.val;
        }
        return c;

    }
}