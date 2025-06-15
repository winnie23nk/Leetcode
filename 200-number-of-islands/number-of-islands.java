class Pair{
    int row;
    int col;
    Pair(int r, int c){
        this.row=r;
        this.col=c;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    q.add(new Pair(i,j));
                    count++;
                    grid[i][j]=0;
                }
                int[] drow = {-1, 0, 1, 0};
                int[] dcol = {0, 1, 0, -1};
                while(!q.isEmpty()){
                    Pair val=q.remove();
                    int row=val.row;
                    int col=val.col;
                    for(int k=0;k<4;k++){
                        int nrow=row+drow[k];
                        int ncol=col+dcol[k];
                        if(0<=nrow&&nrow<m&&0<=ncol&&ncol<n&&grid[nrow][ncol]=='1'){
                            q.add(new Pair(nrow,ncol));
                            grid[nrow][ncol]='0';
                        }
                    }
                }
            }
        }
        return count;
        
    }
}