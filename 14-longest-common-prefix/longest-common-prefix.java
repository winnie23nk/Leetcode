class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String st=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(st)!=0){
                st=st.substring(0,st.length()-1);
                if(st.length()==0){
                    return "";
                }
            }
        }
        return st;
        
    }
}