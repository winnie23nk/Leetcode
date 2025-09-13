class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        Queue<Integer>q= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        int indeg[]= new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            indeg[prerequisites[i][1]]++;
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        topo(q,list,indeg,arr);
       return arr.size()==numCourses?true:false; 
        
    }
    public void topo(Queue<Integer>q,ArrayList<ArrayList<Integer>>list,int[]indeg,ArrayList<Integer>arr){
       
        while(!q.isEmpty()){
            int val=q.remove();
            arr.add(val);
            for(int i=0;i<list.get(val).size();i++){
                int ele=list.get(val).get(i);
                indeg[ele]--;
                if(indeg[ele]==0){
                    q.add(ele);
                }
            }
        }
    }
}