package SortingandSearching;

import java.util.Arrays;

public class FindPairGivenDifference {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int l=0;
        int r=1;
        while(l<n && r<n){
            int diff=Math.abs(arr[r]-arr[l]);
            if(diff==x && l!=r){
                return 1;
            }else if(diff>x){
                l++;
            }else{
                r++;
            }
        }
        return -1;
    }
}
