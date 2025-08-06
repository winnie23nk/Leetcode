class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        int mem[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mem[i][j]=-1;
            }
        }

        
        return dp(m-1,n-1,obstacleGrid,mem);
    }
    public int dp(int m,int n,int[][]grid,int[][]mem){
    
    if(m==0&&n==0){
        return 1;
    }
    if(m<0||n<0){
        return 0;
    }
    if(grid[m][n]==1){
        return 0;
    }
    if(mem[m][n]!=-1){
        return mem[m][n];
    }
    int left=dp(m,n-1,grid,mem);
    int top=dp(m-1,n,grid,mem);
    return mem[m][n]=top+left;
    }

}