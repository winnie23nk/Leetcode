class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int k=nums.length-1;
        while(i<=k){
            if(nums[i]==val){
                nums[i]=nums[k];
                k--;
            }
            else{
                i++;
            }
        }
        return k+1;
    }
}