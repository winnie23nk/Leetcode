class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int visited[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
            count++;
            dfs(isConnected,visited,i);
            }
        }
        return count;
        
    }
    public void dfs(int[][] isConnected,int[]visited,int start){
        visited[start]=1;
        for(int i=0;i<isConnected[start].length;i++){
            if(visited[i]==0&&isConnected[start][i]==1){
                dfs(isConnected,visited,i);

            }
        }
    }
}