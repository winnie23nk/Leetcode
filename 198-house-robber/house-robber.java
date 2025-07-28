class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int prev=nums[0];
        int prev2=0;
        int curr=0;
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i]+prev2,prev);
            prev2=prev;
            prev=curr;
            
        }
        return curr;
    }
}