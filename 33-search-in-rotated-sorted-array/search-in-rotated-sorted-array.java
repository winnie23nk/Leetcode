class Solution {
    public int search(int[] nums, int target) {
    int val=find(nums,0,nums.length-1,target);
    return val;
    }
    public int find(int nums[],int start,int end,int target){
        
        while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[start]<=nums[mid]){
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
    return -1;
}
}