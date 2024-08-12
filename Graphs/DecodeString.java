package Graphs;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        int currNum = 0;
        String currString = "";
        Stack<Pair> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='['){
                stk.push(new Pair(currNum,currString));
                currNum = 0;
                currString = "";
            }else if(ch==']'){
                Pair p = stk.pop();
                int prevNum = p.currNum;
                String prevString = p.currString;
                currString = prevString + currString.repeat(prevNum);
            }else if(Character.isDigit(ch)){
                currNum = currNum*10 + (ch-'0');
            }else{
                currString += ch; 
            }
        }
        return currString;
    }
    class Pair{
        int currNum;
        String currString;
        Pair(int currNum, String currString){
            this.currNum = currNum;
            this.currString = currString;
        }
    }
}
