class Solution {
    public int search(int[] nums, int target) {
        int beg=0;
        int end=nums.length-1;
        return bin(nums,target,beg,end);
        
        
    }
    public int bin(int[]nums,int target,int beg,int end){
        if(beg>end){
            return -1;
        }
        int mid=beg+(end-beg)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            return bin(nums,target,beg,mid-1);
        }else{
            return bin(nums,target,mid+1,end);
        }
    }
}