class Solution {
    public void rotate(int[] nums, int k) {
        int d=k%nums.length;
        int n=nums.length;
        int temp[]= new int[d];
        for(int i=n-d;i<n;i++){
            temp[i-(n-d)]=nums[i];
        }
       for(int i=n-1;i>=d;i--){
        nums[i]=nums[i-d];
       }
       for(int i=0;i<d;i++){
        nums[i]=temp[i];
       }
        
    }
}