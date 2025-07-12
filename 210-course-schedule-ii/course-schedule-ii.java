class Edge{
    int src;
    int dest;
    Edge(int src,int dest){
        this.src=src;
        this.dest=dest;
    }
}
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         ArrayList<Edge>graph[]=new ArrayList[numCourses];
         int order[]= new int [numCourses];
         int empty[]={};
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<Edge>();
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][1];
            int v=prerequisites[i][0];
            graph[u].add(new Edge(u,v));
        }
        boolean vis[]= new boolean[numCourses];
        boolean visited[]=new boolean[numCourses];
        Stack<Integer>s=new Stack<>();
        boolean rec[]= new boolean[numCourses];
       for(int i=0;i<visited.length;i++){
        if(visited[i]==false){
            boolean val=cycle(graph,i,visited,rec);
            if(val){
                return empty;
            }
        }
       }
       for(int i=0;i<vis.length;i++){
        if(vis[i]==false){
            dfs(graph,i,vis,s);
        }
       }
        int i=0;
        while(!s.isEmpty()){
           
                order[i++]=s.pop();
           

        }
        return order;
        
    }

    public void dfs(ArrayList<Edge>graph[],int curr, boolean vis[],Stack<Integer>s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(vis[e.dest]==false){
                dfs(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }

    public boolean cycle(ArrayList<Edge>graph[],int curr,boolean vis[],boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(rec[e.dest]==true){
                return true;
            }
            if(vis[e.dest]==false){
                if(cycle(graph,e.dest,vis,rec)){
                    return true;
                }
            }
        }
        rec[curr]=false;
        return false;


    }
}