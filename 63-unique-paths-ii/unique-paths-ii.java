class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int mem[][]= new int[m][n];
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0){
                    mem[i][j]=1;
                }
                else{
                    if(obstacleGrid[i][j]==1){
                        mem[i][j]=0;
                    }else{
                        int top=0;
                        int left=0;
                        if(i!=0){
                             top=mem[i-1][j];
                        }
                        if(j!=0){
                            left=mem[i][j-1];
                        }
                        mem[i][j]=top+left;
                    }
                }
            }
        }
        
      return mem[m-1][n-1];
    }
}