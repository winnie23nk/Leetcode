class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character>st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
           if(s.charAt(i)==')'){
            if(st.isEmpty()){
                return false;
            }
            char val=st.pop();
            if(val!='('){
                return false;
            }
           }

           if(s.charAt(i)==']'){
            if(st.isEmpty()){
                return false;
            }
            char val=st.pop();
            if(val!='['){
                return false;
            }
           }

           if(s.charAt(i)=='}'){
            if(st.isEmpty()){
                return false;
            }
            char val=st.pop();
            if(val!='{'){
                return false;
            }
           }
           i++;
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
        
    }
}