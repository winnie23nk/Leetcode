class Solution {
    public int countSubstrings(String s) {
        int start=0;int end=0;int val=0;
        for(int i=0;i<s.length();i++){
            int odd=find(s,i,i);
            int even=find(s,i,i+1);
            val=val+odd+even;
            
        }
        return val;


    }
    public int find(String s, int l,int r){
        int count=0;
        while(l>=0&&r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                l--;
                r++;
                count++;
            }else{
                break;          
            }
        }
        return count;
    }
} 

        
   
