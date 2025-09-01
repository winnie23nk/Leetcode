class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]>q=new LinkedList<>();
        int fresh=0;
        int time=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                  fresh++;
                }
            }
        }
        if(fresh==0)return 0;
        int arr[][]={{0,1},{1,0},{-1,0},{0,-1}};
        int x=0;
        int y=0;
        while(!q.isEmpty()){
            time++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int val[]=q.remove();
               for(int j=0;j<arr.length;j++){
                x=val[0]+arr[j][0];
                y=val[1]+arr[j][1];
                if(x>=0&&y>=0&&x<grid.length&&y<grid[0].length&&grid[x][y]==1){
                    grid[x][y]=2;
                    fresh--;
                    q.add(new int[]{x,y});
                }


               }
            }

        }
     return fresh==0?time:-1;
        
    }
}