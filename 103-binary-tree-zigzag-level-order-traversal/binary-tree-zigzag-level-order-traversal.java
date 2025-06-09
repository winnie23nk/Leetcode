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
    List<List<Integer>>res=new ArrayList<>();
    Queue<TreeNode>q=new LinkedList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return res;
        }
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            List<Integer>arr=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
            TreeNode remove=q.remove();
            if(level%2==0){
                arr.add(remove.val);

            }else{
                arr.add(0,remove.val);
            }
            if(remove.left!=null)q.add(remove.left);
            if(remove.right!=null)q.add(remove.right);


            }
             res.add(arr);
             level++;
        }
        
        return res;
    }
}