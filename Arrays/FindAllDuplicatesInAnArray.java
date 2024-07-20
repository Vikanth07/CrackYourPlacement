package Arrays;
import java.util.*;
class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[Math.abs(nums[i])-1]<0)lst.add(Math.abs(nums[i]));
            nums[Math.abs(nums[i])-1]*=-1;
        }
        return lst;
    }
}
