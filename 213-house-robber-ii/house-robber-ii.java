class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int temp1[]=new int[nums.length-1];
        int temp2[]= new int[nums.length-1]; 
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                temp1[j++]=nums[i];
            }
            if(i!=nums.length-1){
                temp2[k++]=nums[i];
            }

        }
        int val1=dp(temp1);
        int val2=dp(temp2);
        return Math.max(val1,val2);
        
    }
    public int dp(int nums[]){
        if(nums.length==1){
            return nums[0];
        }
        int prev=nums[0];
        int prev2=0;
        int left=0;
        int curr=0;
        for(int i=1;i<nums.length;i++){
            left=nums[i]+prev2;
            int right=prev;
            curr=Math.max(left,right);
            prev2=prev;
            prev=curr;
            
        }
        return curr;
}
}