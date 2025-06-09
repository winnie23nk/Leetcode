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
    List<Integer>res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return res;
        }

        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode r=q.remove();
            if(r==null){
                arr.add(-101);
            }else{
            arr.add(r.val);
            }
            if(r==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                if(r.left!=null){
                    q.add(r.left);
                }
                if(r.right!=null){
                    q.add(r.right);
                }
            }
        }
     

        int i=0;
        int j=-1;
        while(i<arr.size()){
            if(arr.get(i)==-101){
                res.add(arr.get(j));
            }
            i++;
            j++;
            
        }

        return res;
    

    }
}