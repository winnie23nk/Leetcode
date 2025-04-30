class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int right=0;
        int prod=1;
        int count=0;
        while(left!=nums.length){
          
            prod*=nums[right];
            
            if(prod<k){
                right++;
                count++;
                if(right==nums.length){
                    left++;
                    right=left;
                    prod=1;
                }
            }
        else{
                left++;
                right=left;
                prod=1;
        }
        }
    
     return count;
    }
}