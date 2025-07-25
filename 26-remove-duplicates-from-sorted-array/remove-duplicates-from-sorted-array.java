class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int k=0;
        while(i<nums.length){
            int val=nums[i];
            nums[k]=val;
            k++;
            while(nums[i]==val){
                i++;
                if(i==nums.length){
                    return k;
                }
            }
            
        }
        return k;
    }
}