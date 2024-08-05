package Heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKfrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer> lst = new ArrayList<>(map.keySet());
        lst.sort((a,b)->(map.get(b)-map.get(a)));
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=lst.get(i);
        }
        return arr;
    }
}
