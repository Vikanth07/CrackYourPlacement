package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public void helper(int[] nums,List<List<Integer>> ans, List<Integer> temp,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        helper(nums,ans,temp,i+1);
        temp.remove(temp.size()-1);
        helper(nums,ans,temp,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        helper(nums,ans,sub,0);
        return ans;
    }
}
