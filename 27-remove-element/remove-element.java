class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
                count++;
            }
        }
        return count;
        
    }
}