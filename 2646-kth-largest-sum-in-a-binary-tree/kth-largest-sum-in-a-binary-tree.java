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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        ArrayList<Long>arr=new ArrayList<>();
        long sum=0;
        long level=0;
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
                    sum+=(long)rem.val;
                    if(rem.left!=null){
                        q.add(rem.left);
                    }
                        
                    if(rem.right!=null){
                        q.add(rem.right);
                        
                    }
                   
                }
                 
            }
         Collections.sort(arr);
         Collections.reverse(arr);
         System.out.println(arr);
         if(level<k){
            return -1;
         }
         return arr.get(k-1);

    }
}