package SortingandSearching;

import java.util.Arrays;

public class Permutations {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr2.length;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]+arr2[n-i-1]<k)return false;
        }
        return true;
    }
}
