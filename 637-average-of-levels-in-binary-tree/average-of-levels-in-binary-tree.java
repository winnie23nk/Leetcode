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
    List<Double>arr=new ArrayList<>();
    Queue<TreeNode>q=new LinkedList<>();
    double sum=0;
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null){
            return arr;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode remove=q.poll();
                sum=sum+remove.val;
    
                if(remove.left!=null) q.add(remove.left);
                if(remove.right!=null)q.add(remove.right);
            }
            arr.add(sum/size);
            sum=0;
        }

    return arr;    
    }
}