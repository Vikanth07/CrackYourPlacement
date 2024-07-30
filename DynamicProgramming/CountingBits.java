package DynamicProgramming;

public class CountingBits {
    public int[] countBits(int n) {
        int count,j;
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            count=0;
            j=i;
            while(j>0){
                count++;
                j&=(j-1);
            }
            ans[i]=count;
        }
        return ans;
    }
}
