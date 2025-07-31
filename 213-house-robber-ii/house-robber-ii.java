class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int temp1[]=new int[nums.length-1];
        int temp2[]= new int[nums.length-1]; 
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                temp1[j++]=nums[i];
            }
            if(i!=nums.length-1){
                temp2[k++]=nums[i];
            }

        }
        int mem[]= new int[temp1.length];
        Arrays.fill(mem,-1);
        mem[0]=temp1[0];
        int val1=dp(temp1.length-1,temp1,mem);
         Arrays.fill(mem,-1);
         mem[0]=temp2[0];
        int val2=dp(temp2.length-1,temp2,mem);
        return Math.max(val1,val2);
        
    }
    public int dp(int idx,int nums[],int mem[]){
        if(idx<0){
            return 0;
        }
        if(mem[idx]!=-1){
            return mem[idx];
        }
             
        int left=nums[idx]+dp(idx-2,nums,mem);
        int right=dp(idx-1,nums,mem);
        return mem[idx]=Math.max(left,right);
    }
}