class Pair{
    int src;
    int dest;
    Pair(int src,int dest){
        this.src=src;
        this.dest=dest;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
        
    }
    public void bfs(char grid[][],int i,int j){
        grid[i][j]='0';
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            Pair val=q.remove();
            int row=val.src;
            int col=val.dest;
            int drow[]={-1,0,1,0};
            int dcol[]={0,1,0,-1};
            for(int k=0;k<4;k++){
                int nrow=row+drow[k];
                int ncol=col+dcol[k];
                if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&grid[nrow][ncol]=='1'){
                    q.add(new Pair(nrow,ncol));
                    grid[nrow][ncol]='0';
                }
            }
        }

    }
}