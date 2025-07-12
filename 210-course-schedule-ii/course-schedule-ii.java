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
        ArrayList<Edge>graph[]= new ArrayList[numCourses];
        int inorder[]= new int[numCourses];
         int order[]= new int[numCourses];
         int arr[]={};
         int j=0;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            graph[i]= new ArrayList<Edge>();
        }
        for(int i=0;i<prerequisites.length;i++){
            int u= prerequisites[i][1];
            int v=prerequisites[i][0];
            graph[u].add(new Edge(u,v));
            inorder[v]++;
        }
        for(int i=0;i<numCourses;i++){
            if(inorder[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr=q.remove();
            order[j++]=curr;
           for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            inorder[e.dest]--;
            if(inorder[e.dest]==0){
                q.add(e.dest);
            }
           }
        }


        return j==numCourses?order:arr;
    }
}