class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        rec(nums,list,new ArrayList<>(),0);
        return list;
        
    }
    public void rec(int nums[],List<List<Integer>>list,List<Integer>val,int idx){
        if(idx==nums.length){
            list.add(new ArrayList<>(val));
            return;
        }
        val.add(nums[idx]);
        rec(nums,list,val,idx+1);
        val.remove(val.size()-1);
        rec(nums,list,val,idx+1);
    }
}