class Solution {
    public int search(int[] nums, int target) {
        return bin(nums,target,0,nums.length-1);
        
    }
    public int bin(int[]nums,int target, int beg,int end){
        if(beg>end){
            return -1;
        }
        int mid=beg+(end-beg)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(mid!=nums.length-1&&nums[mid+1]<=target&&target<=nums[end]){
            return bin(nums,target,mid+1,end);
        }else{
            int val= bin(nums,target,beg,mid-1);
            int val2=bin(nums,target,mid+1,end);
            return Math.max(val,val2);
        }

         
        
        
        
    }
}