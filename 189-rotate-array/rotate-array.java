class Solution {
    public void rotate(int[] nums, int k) {
        int d=k%nums.length;
        rev(nums.length-d,nums.length-1,nums);
        rev(0,nums.length-d-1,nums);
        rev(0,nums.length-1,nums);
        
    }
    public void rev(int start, int end,int[]nums){
        while(start<end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }
}