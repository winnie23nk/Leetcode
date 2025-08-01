class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int m=k%nums.length;
        int temp[]= new int[m];
        for(int i=n-m;i<n;i++){
            temp[i-(n-m)]=nums[i];
        }
        for(int i=n-1;i>=m;i--){
            nums[i]=nums[i-m];
        }
        for(int i=0;i<m;i++){
            nums[i]=temp[i];
        }
        
    }
}