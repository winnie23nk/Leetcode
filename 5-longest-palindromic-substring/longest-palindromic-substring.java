class Solution {
    public String longestPalindrome(String s) {
        int start=0;int end=0; int len=0;int val=0;
        for(int i=0;i<s.length();i++){
            int odd=find(s,i,i);
            int even=find(s,i,i+1);
            val=Math.max(odd,even);
            if(val>len){
                len=val;
                start=i-((len-1)/2);
                end=i+(len/2);
            }
            
        }
        return s.substring(start,end+1);


    }
    public int find(String s, int l,int r){
        while(l>=0&&r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }else{
                break;
            }
        }
        return r-l-1;
    }
}