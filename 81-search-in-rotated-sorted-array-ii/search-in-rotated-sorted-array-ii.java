class Solution {
    public boolean search(int[] nums, int target) {
    boolean val=find(nums,0,nums.length-1,target);
    return val;
    }
    public boolean find(int nums[],int start,int end,int target){
        
        while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return true;
        }
        if(nums[start]==nums[mid]&&nums[mid]==nums[end]){
            start=start+1;
            end=end-1;
        }
        else if(nums[start]<=nums[mid]){
            if(nums[start]<=target&&target<=nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }else{
            if(nums[mid]<=target&&target<=nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
       
    }
    return false;
}
}