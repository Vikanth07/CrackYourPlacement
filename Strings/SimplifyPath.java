package Strings;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String res="";
        Stack<String> stk = new Stack<>();
        for(int i=0; i<path.length(); i++){
            char ch = path.charAt(i);
            if(ch=='/')continue;
            String temp="";
            while(i<path.length() && path.charAt(i)!='/'){
                temp+=path.charAt(i);
                i++;
            }
            if(temp.equals("."))continue;
            else if(temp.equals("..")){
                if(!stk.isEmpty())stk.pop();
            }else{
                stk.push(temp);
            }
        }
        while(!stk.isEmpty()){
            res='/'+stk.pop()+res;
        }
        return res.length()>0?res:"/";
    }
}
