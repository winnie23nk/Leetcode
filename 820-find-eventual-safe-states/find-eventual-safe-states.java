class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int visited[]=new int[graph.length];
        int pvisited[]=new int[graph.length];
        int safe[]=new int[graph.length];

        for(int i=0;i<graph.length;i++){
            if(visited[i]==0){
                dfs(visited,pvisited,safe,graph,i);
            }
        }
        
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<safe.length;i++){
            if(safe[i]==1){
                list.add(i);
            }
        }
        return list;
    }
    public boolean dfs(int[] vis,int[] pvis,int[] safe,int[][]graph,int start){
        vis[start]=1;
        pvis[start]=1;
        for(int i=0;i<graph[start].length;i++){
            int val=graph[start][i];
            if(vis[val]==0){
                if(!dfs(vis,pvis,safe,graph,val))return false;
            }
            if(pvis[val]==1){
                return false;
            }
    }
        pvis[start]=0;
        safe[start]=1;
        return true;
}
}
