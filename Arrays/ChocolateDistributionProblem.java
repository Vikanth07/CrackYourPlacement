package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int i=0;
        int j=m-1;
        long mini = Long.MAX_VALUE;
        while(j<n){
            long diff = a.get(j)-a.get(i);
            mini = (long)Math.min(mini,diff);
            i++;
            j++;
        }
        return mini;
    }
}
