class Solution {
    public int minPathSum(int[][] grid) {
        int m= grid.length;
        int n=grid[0].length;
        int mem[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mem[i][j]=-1;
            }
        }
        return dp(m-1,n-1,grid,mem);
        
    }
    public int dp(int m, int n, int[][]grid,int mem[][]){
        if(m==0&&n==0){
            return grid[m][n];
        }
        if(m<0){
            return Integer.MAX_VALUE-200;
        }
        if(n<0){
             return Integer.MAX_VALUE-200;
        }
        if(mem[m][n]!=-1){
            return mem[m][n];
        }
        int top=grid[m][n]+dp(m-1,n,grid,mem);
        int left=grid[m][n]+dp(m,n-1,grid,mem);
        return mem[m][n]=Math.min(top,left);
    }
}