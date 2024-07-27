package Greedy;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0,totalcost=0,start=0,curr=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
        }
        for(int i=0;i<cost.length;i++){
            totalcost+=cost[i];
        }
        if(totalgas<totalcost){
            return -1;
        }

        for(int i=0;i<gas.length;i++){
            curr+=gas[i]-cost[i];
            if(curr<0){
                start=i+1;
                curr=0;
            }
        }
        return start;
    }
}
