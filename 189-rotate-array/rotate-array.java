class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);

        
    }
    public void reverse(int start,int end,int[]nums){
        while(start<end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;


        }
    }
}