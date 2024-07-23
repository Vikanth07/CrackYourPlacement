package Mathematical;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int steps=0;
        int n = nums.length;
        for(int i=0; i<n/2; i++){
            steps+=nums[n-i-1]-nums[i];
        }
        return steps;
    }
}
