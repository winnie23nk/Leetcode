class Edge{
    int src;
    int dest;
    Edge(int s, int d){
        this.src=s;
        this.dest=d;
    }
}
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Edge>graph[]=new ArrayList[numCourses];
        boolean val=false;
        boolean visited[]= new boolean[numCourses];
         boolean rec[]= new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<Edge>();
        }
        
        for(int i=0;i< prerequisites.length;i++){
            int dest= prerequisites[i][0];
            int src= prerequisites[i][1];
            graph[src].add(new Edge(src,dest));

        }
        for(int i=0;i<numCourses;i++){
            if(visited[i]==false){
                 val=dfs(graph,visited,rec,i);
                if(val){
                    break;
                }

            }

        }
        return !val;
        
    }
    public boolean dfs(ArrayList<Edge>graph[],boolean visited[],boolean rec[],int curr){
        visited[curr]=true;
         rec[curr]=true;
         for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                if(dfs(graph,visited,rec,e.dest)){
                    return true;
                }
            }
            else if(rec[e.dest]==true){
                return true;
            }
         }
         rec[curr]=false;
         return false;

    }
}