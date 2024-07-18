package Arrays;

class Solution {
    public int maxArea(int[] height) {
        int lp=0;
        int rp=height.length-1;
        int maxArea=0;
        while(lp<rp){
            int width = rp-lp;
            int minHeight = Math.min(height[lp],height[rp]);
            int currArea = width*minHeight;
            maxArea = Math.max(currArea,maxArea);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxArea;
    }
}
