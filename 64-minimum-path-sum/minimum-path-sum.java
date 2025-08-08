class Solution {
    public int minPathSum(int[][] grid) {
        int m= grid.length;
        int n=grid[0].length;
        int mem[]= new int[n];
        int curr[]= new int[n];
        for(int i=0;i<m;i++){
            curr= new int[n];
            for(int j=0;j<n;j++){
                if(i==0&&j==0){
                    curr[j]=grid[i][j];
                }
                else{
                int top=Integer.MAX_VALUE;
                int left=Integer.MAX_VALUE;
                if(i!=0){
                top=mem[j]+grid[i][j];
                }
                if(j!=0){
                left=curr[j-1]+grid[i][j];
                }
                curr[j]=Math.min(top,left);
                }


            }
            mem=curr;
        }
        return curr[n-1];
      
    }
}