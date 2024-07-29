package StackandQueues;

import java.util.Stack;

public class BackspaceCompareString {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch!='#'){
                stk1.push(ch);
            }else if(!stk1.isEmpty()){
                stk1.pop();
            }
        }
        for(char ch : t.toCharArray()){
            if(ch!='#'){
                stk2.push(ch);
            }else if(!stk2.isEmpty()){
                stk2.pop();
            }
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(!stk1.isEmpty()){
            sb1.append(stk1.pop());
        }
        while(!stk2.isEmpty()){
            sb2.append(stk2.pop());
        }
        return sb1.toString().equals(sb2.toString());

    }
}
