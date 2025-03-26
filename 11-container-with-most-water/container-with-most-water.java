class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int currmax=0;
        int max=0;
        while(left!=right){
            int min=Math.min(height[left],height[right]);
            int width=right-left;
            currmax=min*width;
            max=Math.max(max,currmax);
            if(min==height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}