class Edge{
    int src;
    int dest;
    Edge(int src,int dest){
        this.src=src;
        this.dest=dest;
    }
}
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Edge>graph[]=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<Edge>();
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][1];
            int v=prerequisites[i][0];
            graph[u].add(new Edge(u,v));
        }
        boolean vis[]= new boolean[numCourses];
        boolean rec[]= new boolean[numCourses];
        for(int i=0;i<vis.length;i++){
            if(vis[i]==false){
                boolean val=dfs(graph,i,vis,rec);
                if(val){
                    return !val;
                    
                }
            }
        }
        return true;
        
    }
    public boolean dfs(ArrayList<Edge>graph[],int curr,boolean vis[],boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(rec[e.dest]==true){
                return true;
            }
            if(vis[e.dest]==false){
                if(dfs(graph,e.dest,vis,rec)){
                    return true;
                }
            }
        }
        rec[curr]=false;
        return false;


    }
}