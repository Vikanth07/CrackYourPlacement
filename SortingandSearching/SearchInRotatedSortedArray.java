package SortingandSearching;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int lp=0;
        int rp=nums.length-1;
        while(lp<=rp){
            int mid=lp+(rp-lp)/2;
            if(nums[mid]==target)return mid;
            if(nums[lp]<=nums[mid]){
                if(nums[lp]<=target && target<=nums[mid]){
                    rp=mid-1;
                }else{
                    lp=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[rp]){
                    lp=mid+1;
                }else{
                    rp=mid-1;
                }
            }
        }
        return -1;
    }
}
