class Solution {
    public int climbStairs(int n) {
        int sum=0;
        int mem[]=new int[n+1];
        Arrays.fill(mem,-1);
        return dp(n,sum,mem);
        
    }
    public int dp(int n,int sum,int mem[]){
        if(sum==n){
            return 1;
        }
        if(sum>n){
            return 0;
        }
        if(mem[sum]!=-1){
            return mem[sum];
        }
        
        int left=dp(n,sum+1,mem);
        int right=dp(n,sum+2,mem);
        return mem[sum]=left+right;
    }
}