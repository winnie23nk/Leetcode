class Pair{
    int first;
    int second;
    int time;
    Pair(int first,int second,int time){
        this.first=first;
        this.second=second;
        this.time=time;


    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int freshcount=0;
        int count=0;
        int time=0;
        Queue<Pair>q= new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
                if(grid[i][j]==1){
                    freshcount++;

                }
            }
        }
        while(!q.isEmpty()){
            Pair val=q.remove();
            int row=val.first;
            int col=val.second;
            int t=val.time;
            time=Math.max(time,t);
            int drow[]={-1,0,1,0};
            int dcol[]={0,1,0,-1};
            for(int k=0;k<4;k++){
                int nrow=row+drow[k];
                int ncol=col+dcol[k];
                if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&grid[nrow][ncol]==1){
                    grid[nrow][ncol]=2;
                    q.add(new Pair(nrow,ncol,t+1));
                    count++;
                }
            }

        }
        if(count!=freshcount){
            return -1;
        }


    return time;    
    }
}