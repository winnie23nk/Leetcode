class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int mem[][]=new int[m][m];
        for(int j=0;j<m;j++){
            mem[m-1][j]=triangle.get(m-1).get(j);
        }
        for(int i=m-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int curr=triangle.get(i).get(j)+mem[i+1][j];
                int next=triangle.get(i).get(j)+mem[i+1][j+1];
                mem[i][j]=Math.min(curr,next);
            }
        }
        

        return mem[0][0];
    }
}