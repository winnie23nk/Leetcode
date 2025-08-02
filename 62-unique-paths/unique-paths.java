class Solution {
    public int uniquePaths(int m, int n) {
        int mem[]=new int[n];
        for(int i=0;i<n;i++){
            mem[i]=0;
        }
        int curr[]=new int[n];
        for(int i=0;i<m;i++){
             curr= new int[n];
            for(int j=0;j<n;j++){
                if(j==0){
                    curr[j]=1;
                }else{
                    int top=mem[j];
                    int left=curr[j-1];
                    curr[j]=top+left;
                }
            }
            mem=curr;
        }
        return curr[n-1];
    }
}