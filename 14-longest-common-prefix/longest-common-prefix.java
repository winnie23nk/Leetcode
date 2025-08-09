class Solution {
    public String longestCommonPrefix(String[] strs) {
        String st=strs[0];
        for(int i=1;i<strs.length;i++){
            String st1=strs[i];
             int count=0;
            for(int j=0;j<Math.min(st.length(),st1.length());j++){
                if(st.charAt(j)==st1.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
             if(count==0){
                    return "";
                }
                st=st.substring(0,count);
        }
        return st;
        
    }
}