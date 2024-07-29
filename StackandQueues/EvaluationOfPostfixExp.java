package StackandQueues;

import java.util.Stack;

public class EvaluationOfPostfixExp {
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> stk = new Stack<>();
        for(char ch : S.toCharArray()){
            if(Character.isDigit(ch)){
                stk.push(ch-'0');
            }else{
                int res=0;
                int a = stk.pop();
                int b = stk.pop();
                if(ch=='+'){
                    res = a+b;
                }else if(ch=='-'){
                    res = b-a;
                }else if(ch=='*'){
                    res = a*b;
                }else{
                    res = b/a;
                }
                stk.push(res);
            }
        }
        return stk.peek();
    }
}
