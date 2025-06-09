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
    List<Integer>arr=new ArrayList<>();
    Queue<TreeNode>q=new LinkedList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return arr;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode remove=q.poll();
                if(i==size-1){
                    arr.add(remove.val);
                }
                if(remove.left!=null) q.add(remove.left);
                if(remove.right!=null) q.add(remove.right);
            }

        }
        return arr;
        
    }
}