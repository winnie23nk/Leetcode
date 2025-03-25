class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        String ref=strs[0];
        int count;
        String str="";
        for(int i=1;i<strs.length;i++){
            count=0;
            str="";
        for(int j=0;j<strs[i].length()&&j<ref.length();j++){
            if(strs[i].charAt(j)==ref.charAt(j)){
                count++;
                str=str+ref.charAt(count-1);
                if(j==strs[i].length()-1){
                    ref=str;
                }
            }
            else{
                ref=str;
                break;
            }
        }
        }





            return str;
            }
        }
   
    
