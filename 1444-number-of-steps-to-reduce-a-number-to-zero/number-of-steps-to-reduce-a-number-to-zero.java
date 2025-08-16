class Solution {
    public int numberOfSteps(int num) {
        return step(num,0);
        
    }
    public int step(int num, int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            return step(num/2,count+1);
        }else{
            return step(num-1,count+1);
        }
    }
}