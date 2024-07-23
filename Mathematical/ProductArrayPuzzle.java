package Mathematical;

public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] res = new long[n];
        int k=0;
        for(int i=0; i<n; i++){
            long prod=1;
            for(int j=0; j<n; j++){
                if(i==j)continue;
                prod*=nums[j];
            }
            res[k++]=prod;
        }
        return res;
	} 
}
