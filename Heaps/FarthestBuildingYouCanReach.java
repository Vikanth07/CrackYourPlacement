package Heaps;

import java.util.PriorityQueue;

public class FarthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        int i;
        for(i=0; i<heights.length-1; i++){
            int diff = heights[i+1]-heights[i];
            if(diff<=0)continue;
            maxHeap.offer(diff);
            bricks-=diff;
            if(bricks<0){
                bricks+=maxHeap.poll();
                ladders--;
            }
            if(ladders<0)break;
        }
        return i;
    }
}
