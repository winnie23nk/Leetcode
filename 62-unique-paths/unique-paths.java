class Solution {
    public int uniquePaths(int m, int n) {
        int mem[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mem[i][j]=-1;
            }
            
        }
        return dp(m-1,n-1,mem);
        
    }
    public int dp(int m,int n,int mem[][]){
        if(m<0||n<0){
            return 0;
        }
        if(m==0&&n==0){
            return 1;
        }
        if(mem[m][n]!=-1){
            return mem[m][n];
        }
        int left=dp(m-1,n,mem);
        int right=dp(m,n-1,mem);
        return mem[m][n]=left+right;
    }
}