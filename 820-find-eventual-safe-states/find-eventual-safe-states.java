import java.util.*;
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int outdeg[]= new int[graph.length];
        Queue<Integer>q=new LinkedList<>();
        ArrayList<Integer>sol=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            outdeg[i]=graph[i].length;
        }
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            list.add(new ArrayList<>());
        }
        for(int i=graph.length-1;i>=0;i--){
            for(int j=graph[i].length-1;j>=0;j--){
                list.get(graph[i][j]).add(i);
            }
        }
        for(int i=graph.length-1;i>=0;i--){
            if(outdeg[i]==0){
                q.add(i);
            }
        }
            while(!q.isEmpty()){
                int val=q.remove();
                sol.add(val);
                for(int i=0;i<list.get(val).size();i++){
                    int val2=list.get(val).get(i);
                    outdeg[val2]--;
                    if(outdeg[val2]==0){
                        q.add(val2);
                    }
                }
            }
        
        Collections.sort(sol);
        return sol;
    }
}