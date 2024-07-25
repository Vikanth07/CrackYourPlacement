package SortingandSearching;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsToSort {
    public int minSwaps(int nums[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans=0;
        int n = nums.length;
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i]=nums[i];
        }
        for(int i=0; i<n; i++){
            map.put(nums[i],i);
        }
        Arrays.sort(temp);
        for(int i=0; i<n; i++){
            if(nums[i]!=temp[i]){
                ans++;
                int init = nums[i];
                swap(nums,i, map.get(temp[i]));
                map.put(init, map.get(temp[i]));
                map.put(temp[i],i);
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
