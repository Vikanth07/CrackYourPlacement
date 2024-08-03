package Arrays;
import java.util.HashMap;

class LargestSubArray0Sum{
    int maxLen(int arr[], int n)
    {
        int maxi=0;
        int sum=0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
            }else{
                if(mpp.containsKey(sum)){
                    maxi = Math.max(maxi,i-mpp.get(sum));
                }else{
                    mpp.put(sum,i);
                }
            }
        }
        return maxi;
    }
}