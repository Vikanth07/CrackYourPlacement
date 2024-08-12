package Heaps;

import java.util.PriorityQueue;

public class KClosestPoints {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a,b)->Double.compare(b.dis,a.dis));
        int[] org = {0,0};
        double dis = 0;
        for(int i=0; i<points.length; i++){
            double dx = org[0]-points[i][0];
            double dy = org[1]-points[i][1];
            dis = Math.sqrt(dx*dx+dy*dy);
            if(maxHeap.size()<k){
                maxHeap.offer(new Pair(dis,new int[]{points[i][0],points[i][1]}));
            }else if(dis<maxHeap.peek().dis){
                maxHeap.poll();
                maxHeap.offer(new Pair(dis,new int[]{points[i][0],points[i][1]}));
            }
        }
        int ans[][] = new int[k][2];
        int i=0;
        while(maxHeap.size()>0){
            Pair p = maxHeap.poll();
            int arr[] = {p.pt[0],p.pt[1]};
            ans[i++]=arr;
        }
        return ans;
    }
    class Pair{
        double dis;
        int[] pt;
        Pair(double dis, int[] pt){
            this.dis = dis;
            this.pt = pt;
        }
    }
}
