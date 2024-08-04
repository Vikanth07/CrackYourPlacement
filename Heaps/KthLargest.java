package Heaps;

import java.util.PriorityQueue;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            if(minHeap.size()<k){
                minHeap.offer(nums[i]);
            }else{
                if(nums[i]>minHeap.peek()){
                    minHeap.poll();
                    minHeap.offer(nums[i]);
                }
            }
        }
        return minHeap.peek();
    }
}
