class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlength=0;
        int arr[]= new int [26];
        int maxfreq=0;
        while(r<s.length()){
            char c=s.charAt(r);
            arr[c-'A']++;
            maxfreq=Math.max(maxfreq,arr[c-'A']);
            if((r-l+1)-maxfreq<=k){
                maxlength=Math.max(maxlength,r-l+1);
            }else{
                while(r-l+1-maxfreq>k){
                    arr[s.charAt(l)-'A']--;
                    l=l+1;
                    maxfreq=0;
                    for(int i=0;i<26;i++){
                        maxfreq=Math.max(maxfreq,arr[i]);
                    }
                }
            }
            r++;

        }
        return maxlength;
        
    }
}