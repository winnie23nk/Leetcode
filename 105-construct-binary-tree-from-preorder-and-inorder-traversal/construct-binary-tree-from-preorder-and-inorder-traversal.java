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
    int preorderIn=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,inorder.length-1,map);
        
    }
    public TreeNode helper(int[]preorder, int[]inorder, int left, int right,HashMap<Integer,Integer>map){
        if(left>right) return null;
        int rootval=preorder[preorderIn++];
        TreeNode root= new TreeNode(rootval);
        int inorderIn=map.get(rootval);
        root.left=helper(preorder,inorder,left,inorderIn-1,map);
        root.right=helper(preorder,inorder,inorderIn+1,right,map);
        return root;
    }
}