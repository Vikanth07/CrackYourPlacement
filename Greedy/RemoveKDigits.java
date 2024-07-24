package Greedy;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<num.length(); i++){
            char curr = num.charAt(i);
            while(!stk.isEmpty() && k>0 && (stk.peek()-'0')>(curr-'0')){
                stk.pop();
                k--;
            }
            stk.push(curr);
        }
        while(k>0 && !stk.isEmpty()){
            stk.pop();
            k--;
        }
        if(stk.isEmpty())return "0";
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if(sb.toString().equals(""))return "0";
        return sb.toString();
    }
}
