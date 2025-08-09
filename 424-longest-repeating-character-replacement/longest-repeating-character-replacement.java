class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlength=0;
        int maxfreq=0;
        int arr[]= new int[26];
        while(r<s.length()){
         char c= s.charAt(r);
         arr[c-'A']++;
         maxfreq=Math.max(maxfreq,arr[c-'A']);
         if((r-l+1)-maxfreq>k){
            arr[s.charAt(l)-'A']--;
            l++;
         }
         maxlength=Math.max(maxlength,r-l+1);
         r++;
        }
        return maxlength;
        
    }
}