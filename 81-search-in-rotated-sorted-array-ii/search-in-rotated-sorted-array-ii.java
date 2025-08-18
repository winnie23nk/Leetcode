class Solution {
    public boolean search(int[] nums, int target) {
        return bin(nums,target,0,nums.length-1);
    }
    public boolean bin(int[]nums,int target, int beg,int end){
        if(beg>end){
            return false;
        }
        int mid=beg+(end-beg)/2;
        if(nums[mid]==target){
            return true;
        }
        if(mid!=nums.length-1&&nums[mid+1]<=target&&target<=nums[end]){
            return bin(nums,target,mid+1,end);
        }else{
            boolean val= bin(nums,target,beg,mid-1);
            
            if(val==false){
             boolean val2=bin(nums,target,mid+1,end);
             return val2;
            }
            return val;
        }
        
}
}