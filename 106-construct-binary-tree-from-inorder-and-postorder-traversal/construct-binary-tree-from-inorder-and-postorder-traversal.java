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
     
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int index[]={postorder.length-1};
        return helper(inorder,postorder,0,inorder.length-1,map,index);
        
    }
    public TreeNode helper(int[] inorder, int[] postorder, int left, int right, HashMap<Integer,Integer>map,int[] index){
        if(left>right){
            return null;
        }
        int rootval= postorder[index[0]--];

        TreeNode root= new TreeNode(rootval);
        int InorderIn= map.get(rootval);
          root.right= helper(inorder,postorder,InorderIn+1,right,map,index);
          root.left= helper(inorder,postorder,left,InorderIn-1,map,index);
        return root;
    }
}