class Solution {
    public void solve(char[][] board) {
        int[][]visited=new int[board.length][board[0].length];
        int i=0;
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]=='O'&&visited[i][j]!=1){
                dfs(visited,i,j,board);
            }
        }
        i=board.length-1;
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]=='O'&&visited[i][j]!=1){
                dfs(visited,i,j,board);
            }
        }
        int j=0;
        for(i=0;i<board.length;i++){
            if(board[i][j]=='O'&&visited[i][j]!=1){
                dfs(visited,i,j,board);
            }
        }
        j=board[0].length-1;
         for(i=0;i<board.length;i++){
            if(board[i][j]=='O'&&visited[i][j]!=1){
                dfs(visited,i,j,board);
            }
        }

        for( i=0;i<board.length;i++){
            for(j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&visited[i][j]!=1){
                    board[i][j]='X';
                }
            }
        }
        
    }
    public void dfs(int[][]visited,int i,int j,char[][]board){
        if(i<0||j<0||i>=visited.length||j>=visited[0].length){
            return;
        }
        if(board[i][j]!='O'||visited[i][j]==1){
            return;
        }
        visited[i][j]=1;
      
        dfs(visited,i+1,j,board);
        dfs(visited,i-1,j,board);
        dfs(visited,i,j-1,board);
        dfs(visited,i,j+1,board);
    }
}