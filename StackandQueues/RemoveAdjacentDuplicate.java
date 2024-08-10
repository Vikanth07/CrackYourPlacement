package StackandQueues;

import java.util.Stack;

public class RemoveAdjacentDuplicate {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        if(n<k)return s;
        Stack<Pair> stk = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(stk.isEmpty() || stk.peek().ch!=ch){
                stk.push(new Pair(ch,1));
            }else{
                Pair p = stk.pop();
                stk.push(new Pair(ch, p.freq+1));
            }
            if(stk.peek().freq==k)stk.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            Pair p = stk.pop();
            while(p.freq-->0){
                sb.insert(0,p.ch);
            }
        }
        return sb.toString();
    }
    class Pair{
        char ch;
        int freq;
        Pair(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }
    }
}
