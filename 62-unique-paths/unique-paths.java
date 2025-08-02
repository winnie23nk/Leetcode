class Solution {
    public int uniquePaths(int m, int n) {
        int mem[][]= new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i==0&&j==0){
                mem[i][j]=1;
            }
            else{
                int top=0;
                int left=0;
                if(i>0){
                 top=mem[i-1][j];
                }
                if(j>0){
                 left=mem[i][j-1]; 
            }
            mem[i][j]=top+left;
        }
       }
        
      
      
    }
     return mem[m-1][n-1];
}
}