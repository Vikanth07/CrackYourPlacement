package SortingandSearching;

class Solution {
    public int findPeakElement(int[] nums) {
        int lp = 0;
        int rp = nums.length-1;
        while(lp<=rp){
            int mid = (lp+rp)>>1;
            boolean isLeft = (mid==0) || (nums[mid]>nums[mid-1]);
            boolean isRight = (mid==nums.length-1) || (nums[mid]>nums[mid+1]);
            if(isLeft && isRight){
                return mid;
            }else if(!isLeft){
                rp=mid-1;
            }else{
                lp=mid+1;
            }
        }
        return -1;
    }
}