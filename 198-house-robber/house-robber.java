class Solution {
    public int rob(int[] nums) {
        int idx=nums.length-1;
        int sum=0;
        int mem[]= new int[nums.length+1];
        Arrays.fill(mem,-1);
        return dp(nums,idx,mem);
        
    }
    public int dp(int nums[],int idx,int mem[]){
        if(idx==0){
            return nums[0];
        }
        if(idx<0){
            return 0;
        }
        if(mem[idx]!=-1){
            return mem[idx];
        }

        int left=nums[idx]+dp(nums,idx-2,mem);
        int right=dp(nums,idx-1,mem);
        return mem[idx]=Math.max(left,right);
        
    }
}