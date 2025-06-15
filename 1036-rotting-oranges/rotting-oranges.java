class Pair{
    int row;
    int col;
    int time;
    Pair(int r,int c,int t){
        this.row=r;
        this.col=c;
        this.time=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int visited[][]=new int[m][n];
        Queue<Pair>q=new LinkedList<>();
        int freshc=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                else{
                    visited[i][j]=0;
                }
                if(grid[i][j]==1){
                    freshc++;
                }
            }
        }
        int count=0;
        int time=0;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};

        while(!q.isEmpty()){
            Pair val=q.remove();
            int r=val.row;
            int c=val.col;
            int t=val.time;
            time=Math.max(time,t);
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(0<=nrow&&nrow<m&&0<=ncol&&ncol<n&&visited[nrow][ncol]==0&&grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    visited[nrow][ncol]=2;
                    count++;
                }
            }
        }
        if(count!=freshc){
            return -1;
        }
        return time;

        
    }
}