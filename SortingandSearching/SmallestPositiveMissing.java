package SortingandSearching;

public class SmallestPositiveMissing {
    static int missingNumber(int arr[], int size)
    {
        for(int i=0; i<size; i++){
            int crtidx = arr[i]-1;
            while(arr[i]>0 && arr[i]<=size && arr[i]!=arr[crtidx]){
                int temp = arr[i];
                arr[i] = arr[crtidx];
                arr[crtidx] = temp;
                crtidx = arr[i]-1;
            }
        }
        for(int i=0; i<size; i++){
            if(arr[i]!=i+1)return i+1;
        }
        return size+1;
    }
}
