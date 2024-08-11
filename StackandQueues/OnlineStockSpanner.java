package StackandQueues;
import java.util.*;
class StockSpanner {
    Stack<Pair> stk;
    int ind;
    public StockSpanner() {
        stk = new Stack<>();
        ind = -1;
    }
    
    public int next(int price) {
        ind = ind+1;
        while(!stk.isEmpty() && stk.peek().val<=price){
            stk.pop();
        }
        int ans = ind - (stk.isEmpty()?-1:stk.peek().ind);
        stk.push(new Pair(price,ind));
        return ans;
    }
    class Pair{
        int val;
        int ind;
        Pair(int val,int ind){
            this.val=val;
            this.ind=ind;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */