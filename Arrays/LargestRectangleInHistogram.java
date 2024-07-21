package Arrays;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int maxArea=0;
        for(int i=0; i<heights.length; i++){
            while(!stk.isEmpty() && heights[stk.peek()]>heights[i]){
                int element=stk.peek();
                stk.pop();
                int nse = i;
                int pse = stk.isEmpty()?-1:stk.peek();
                maxArea=Math.max(maxArea, heights[element]*(nse-pse-1));
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            int nse = heights.length;
            int element = stk.peek();
            stk.pop();
            int pse = stk.isEmpty()?-1:stk.peek();
            maxArea=Math.max(maxArea, heights[element]*(nse-pse-1));
        }
        return maxArea;
    }
}
