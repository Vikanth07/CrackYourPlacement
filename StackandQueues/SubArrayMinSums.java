package StackandQueues;

import java.util.Stack;

public class SubArrayMinSums {
    public int sumSubarrayMins(int[] arr) {
        int[] nse = findNse(arr);
        int[] psee = findPsee(arr);
        long total = 0;
        int mod = (int)1e9+7;
        int n = arr.length;
        for(int i=0; i<n; i++){
            int left = i-psee[i];
            int right = nse[i]-i;
            total += (long)(right)*(left)%mod*arr[i]%mod;
            total %=mod;
        }
        return (int)total;
    }
    public int[] findNse(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nse = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return nse;
    }
    public int[] findPsee(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] psee = new int[n];
        for(int i=0; i<n ;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            psee[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return psee;
    }
}
