class Solution {
    public int numEnclaves(int[][] grid) {
        int[][]visited=new int[grid.length][grid[0].length];
        int i=0;
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                if(visited[i][j]!=1){
                    dfs(grid,visited,i,j);
                }
            }
        }
        i=grid.length-1;
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                if(visited[i][j]!=1){
                    dfs(grid,visited,i,j);
                }
            }
        }
        int j=0;
        for(i=0;i<grid.length;i++){
            if(grid[i][j]==1){
                if(visited[i][j]!=1){
                    dfs(grid,visited,i,j);
                }
            }
        }
        j=grid[0].length-1;
         for(i=0;i<grid.length;i++){
            if(grid[i][j]==1){
                if(visited[i][j]!=1){
                    dfs(grid,visited,i,j);
                }
            }
        }
         int count=0;
        for(int a=0;a<grid.length;a++){
            for(int b=0;b<grid[0].length;b++){
                if(grid[a][b]==1&&visited[a][b]==0){
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int[][]grid,int[][]visited,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||visited[i][j]==1||grid[i][j]==0){
            return;
        }
        visited[i][j]=1;
        dfs(grid,visited,i+1,j);
        dfs(grid,visited,i-1,j);
        dfs(grid,visited,i,j+1);
        dfs(grid,visited,i,j-1);

    }
}