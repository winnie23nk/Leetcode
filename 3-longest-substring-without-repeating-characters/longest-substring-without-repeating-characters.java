class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int right=0;
        int maxlength=0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                if(map.get(s.charAt(right))>=left){
                    left=map.get(s.charAt(right))+1;
                }
                
                
            }
            map.put(s.charAt(right),right);
            maxlength=Math.max(maxlength,right-left+1);
            
            right++;
        }




    
    
            
    return maxlength;

    }
}