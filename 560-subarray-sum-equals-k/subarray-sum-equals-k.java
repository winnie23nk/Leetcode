class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       map.put(0,1);
       int curr=0;
       int sub=0;
       for(int i=0;i<nums.length;i++){
        curr+=nums[i];
        if(map.containsKey(curr-k)){
            sub+=map.get(curr-k);
        }
        if(map.containsKey(curr)){
            map.put(curr,map.get(curr)+1);
        }
        else{
            map.put(curr,1);
        }
    

       }
       return sub;
    }
}