class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int lsum=0;
        int rsum=0;
        int i=0;
         int j=cardPoints.length-1;
       
        while(i<k){
            lsum=lsum+cardPoints[i];
            i++;
        }
        i--;
        sum=lsum+rsum;
        while(j!=cardPoints.length-k-1){
            lsum=lsum-cardPoints[i--];
            rsum=rsum+cardPoints[j--];
            sum=Math.max(sum,lsum+rsum);

        }
        return sum;
    }
}