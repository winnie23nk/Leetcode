class Solution {
    public int compress(char[] chars) {
        int i=0;
        int count=0;
        int j=0;
        while(i<chars.length){
            char val=chars[i];
            while(i<chars.length&&chars[i]==val){
                count++;
                i++;
            }
            if(count==1){
                chars[j++]=val;
            }
            else{
                String c=Integer.toString(count);
                chars[j++]=val;
                for(int k=0;k<c.length();k++){
                    chars[j++]=c.charAt(k);
                }
            }
            count=0;


        }

        return j;
    }
}