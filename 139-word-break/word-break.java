class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String>set= new HashSet<>(wordDict);
        int maxlength=0;
        for(String word:wordDict){
            maxlength=Math.max(maxlength,word.length());
        }
        boolean mem[]= new boolean[s.length()+1];
        mem[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=i-1;j>=Math.max(0,i-maxlength);j--){
                if(mem[j]&&(set.contains(s.substring(j,i)))){
                    mem[i]=true;
                    break;
                }
            }

        }
        return mem[s.length()];
    }
}