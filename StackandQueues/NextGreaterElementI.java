package StackandQueues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> ngeMap = new HashMap<>();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && nums2[st.peek()]<=nums2[i]){
                st.pop();
            }
            ngeMap.put(nums2[i],st.isEmpty()?-1:nums2[st.peek()]);
            st.push(i);
        }
        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i]=ngeMap.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}
