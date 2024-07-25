package Strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    List<String> lst = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(0,0,n,"");
        return lst;
    }
    public void helper(int op, int cc, int n, String ans){
        if(op==n && cc==n){
            lst.add(ans);
            return;
        }
        if(op<n){
            helper(op+1,cc,n,ans+"(");
        }
        if(cc<op){
            helper(op, cc+1, n, ans+")");
        }
    }
}
