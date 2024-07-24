package Greedy;

import java.util.Arrays;

public class NonoverlappingIntervals {
     public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[1]-b[1]);
        int n = intervals.length;
        int cnt=1;
        int lstEndTime = intervals[0][1];
        for(int i=1; i<n; i++){
            if(intervals[i][0]>=lstEndTime){
                cnt++;
                lstEndTime=intervals[i][1];
            }
        }
        return n-cnt;
    }
}
