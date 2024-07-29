package StackandQueues;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                results[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return results;
    }
}
