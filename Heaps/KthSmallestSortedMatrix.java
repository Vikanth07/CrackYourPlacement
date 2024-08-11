package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(maxHeap.size()<k)maxHeap.offer(matrix[i][j]);
                else if(matrix[i][j]<maxHeap.peek()){
                    maxHeap.poll();
                    maxHeap.offer(matrix[i][j]);
                }
            }
        }
        return maxHeap.peek();
    }
}
