class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[]= new int [255];
        int len=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            Arrays.fill(hash,0);
            len=0;
            for(int j=i;j<s.length();j++){
                if(hash[s.charAt(j)]==1){
                    break;
                }
                len=j-i+1;
                maxlen=Math.max(maxlen,j-i+1);
                hash[s.charAt(j)]=1;

            }
        }
        return maxlen;
    }
}