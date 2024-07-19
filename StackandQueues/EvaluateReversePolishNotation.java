package StackandQueues;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int a = stack.pop();
                int b = stack.pop();
                if(tokens[i].equals("+")){
                    stack.push(a+b);
                }else if(tokens[i].equals("-")){
                    stack.push(b-a);
                }else if(tokens[i].equals("*")){
                    stack.push(a*b);
                }else{
                    stack.push(b/a);
                }
            }
        }
        return stack.pop(); 
    }
}
