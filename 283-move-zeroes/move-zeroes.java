class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        int count=0;
        if(nums.length==1){
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        for(int i=0;i<count;i++){
            nums[arr.size()+i]=0;
        }
        
    }
}