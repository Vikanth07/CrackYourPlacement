package Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(mid,low,nums);
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(mid,high,nums);
                high--;
            }
        }
    }
    public void swap(int a, int b , int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
