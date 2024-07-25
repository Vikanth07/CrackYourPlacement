package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length+1];
        for(int[] d : dp){
            Arrays.fill(d,-1);
        }
        return helper(nums,0,-1,dp);
    }
    public int helper(int[] nums, int curr, int prev,int[][] dp){
        if(curr==nums.length){
            return 0;
        }
        if(dp[curr][prev+1]!=-1)return dp[curr][prev+1];
        int pick=0;
        if(prev==-1 || nums[curr]>nums[prev]){
            pick=1+helper(nums,curr+1,curr,dp);
        }
        int dontpick=0+helper(nums,curr+1,prev,dp);
        return dp[curr][prev+1]=Math.max(pick,dontpick);
    }
}
