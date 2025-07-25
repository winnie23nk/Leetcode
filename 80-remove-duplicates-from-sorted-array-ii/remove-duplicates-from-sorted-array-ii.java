class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int k=0;
        while(i<nums.length){
            int val=nums[i];
            nums[k]=val;
            i++;
            k++;
            if(i==nums.length){
                return k;
            }
            int count=0;
            while(nums[i]==val){
                if(count==0){
                    nums[k]=val;
                    k++;
                    count++;
                }
                i++;
                if(i==nums.length){
                    return k;
                }
            }
            
        }
        return k;
        
    }
}