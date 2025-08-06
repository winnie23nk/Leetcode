class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int mem[]= new int[n];
        int curr[]=new int[n];
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        for(int i=0;i<m;i++){
               curr=new int[n];
            for(int j=0;j<n;j++){
                if(i==0&&j==0){
                    curr[j]=1;
                }else{
                    if(obstacleGrid[i][j]==1){
                        curr[j]=0;
                    }else{
                        int top=0;
                        int left=0;
                        top=mem[j];
                        if(j!=0){
                            left=curr[j-1];
                        }
                        curr[j]=top+left;
                    }
                }
               
            }
             mem=curr;
        }
        return curr[n-1];
        
    }
}