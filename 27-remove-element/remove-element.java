import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer>num=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                num.add(nums[i]);
            }
        }
        for(int j=0;j<num.size();j++){
            nums[j]=num.get(j);
        }
       

        return num.size();
       
    }
}