package DynamicProgramming;

public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        double prefix = 1;
        double suffix = 1;
        int n = nums.length;
        double maxi = nums[0];
        for(int i=0; i<n; i++){
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;
            prefix*=nums[i];
            suffix*=nums[n-1-i];
            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }
        return (int)maxi;
    }
}
