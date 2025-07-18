class Solution {
    public static int binsearch(int arr[],int k,int low,int high){
        if(low>high){
            return -1;
        }
        
        int mid=low+(high-low)/2;
        if(k==arr[mid]){
            return mid;
        }
        if(k<arr[mid]){
            return binsearch(arr,k,low,mid-1);
        }
        
            return binsearch(arr,k,mid+1,high);

    }
    public int search(int[] nums, int target) {
        int val=binsearch(nums,target,0,nums.length-1);
        return val;
        
    }
}