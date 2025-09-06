package Sorting;
import java.util.*;

public class MergeSort {
    public static void mergeSortHelper(int[] arr, int low, int high){
        if(low>=high)return;
        int mid = (low+high)/2;
        mergeSortHelper(arr, low, mid);
        mergeSortHelper(arr, mid+1, high);
        merge(arr, low, mid, high);

    }
    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }

    }
    public static void main(String[] args){
        int arr[] = {1,6,1,7100, 19879, 1,13,5,2};
        mergeSortHelper(arr, 0, arr.length-1);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
