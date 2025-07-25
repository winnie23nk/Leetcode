class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                el=nums[i];
                count++;
            }
            else if(el==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return el;
    }
}