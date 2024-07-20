package Arrays;

import java.util.*;
class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
        int preSum=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            preSum+=nums[i];
            if(map.containsKey(preSum-k)){
                cnt+=map.get(preSum-k);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return cnt;
    }
}
