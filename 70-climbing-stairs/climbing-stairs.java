class Solution {
    public int climbStairs(int n) {
        int sum=n;
         int mem[]=new int[n+1];
         Arrays.fill(mem,-1);

        return dp(sum,n,mem);
        
    }
    public int dp(int sum,int n,int[]mem){
        if(sum<=2){
            return sum;
        }
        if(mem[sum]!=-1){
            return mem[sum];
        }
        int left=dp(sum-1,n,mem);
        int right=dp(sum-2,n,mem);
        return mem[sum]=left+right;
    }
}