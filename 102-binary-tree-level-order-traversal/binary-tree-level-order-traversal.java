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
    public List<List<Integer>> levelOrder(TreeNode root){
         List<List<Integer>>arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
     
       
        List<Integer>mini= new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode rem=q.remove();
            if(rem==null){
                arr.add(new ArrayList<>(mini));
                mini.clear();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    
                }
                }
                else{
                    mini.add(rem.val);
                    if(rem.left!=null){
                        q.add(rem.left);
                    }
                        
                    if(rem.right!=null){
                        q.add(rem.right);
                        
                    }
                   
                }
                 
            }
         return arr;
    
        
    }
}