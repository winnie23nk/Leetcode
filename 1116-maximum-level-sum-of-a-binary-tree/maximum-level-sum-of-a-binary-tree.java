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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        ArrayList<Integer>arr=new ArrayList<>();
        int sum=0;
        int level=0;
        
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode rem=q.remove();
            if(rem==null){
                arr.add(sum);
                level++;
                sum=0;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    
                }
                }
                else{
                    sum+=rem.val;
                    if(rem.left!=null){
                        q.add(rem.left);
                    }
                        
                    if(rem.right!=null){
                        q.add(rem.right);
                        
                    }
                   
                }
                 
            }
         return arr.indexOf(Collections.max(arr))+1;

    }
}