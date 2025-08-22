class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>val=new ArrayList<>();
        rec(candidates,target,0,0,list,val);
        return list;
        
    }
    public void rec(int arr[],int target,int sum, int idx, List<List<Integer>>list,List<Integer>val){
        if(sum==target){
            list.add(new ArrayList<>(val));
            return;
        }
        if(idx==arr.length){
            return;
        }
        if(sum>target){
            return;
        }
        val.add(arr[idx]);
        sum=sum+arr[idx];
         rec(arr,target,sum,idx,list,val);
        val.remove(val.size()-1);
        sum=sum-arr[idx];
         rec(arr,target,sum,idx+1,list,val);
    }
}