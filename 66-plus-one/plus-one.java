class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        int[]arr=new int[digits.length+1];
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
            arr[i]=0;
        }
        return arr;
        
    }
}