import java.util.*;
  public class InorderTraversal {
      int val;
      InorderTraversal left;
      InorderTraversal right;
      InorderTraversal() {}
      InorderTraversal(int val) { this.val = val; }
      InorderTraversal(int val, InorderTraversal left, InorderTraversal right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class Solution {
    List<Integer> lst = new ArrayList<>();
    public List<Integer> inorderTraversal(InorderTraversal root) {
        if(root==null) return lst;
        helper(root);
        return lst;
    }
    public void helper(InorderTraversal root){
        if(root==null)return;
        helper(root.left);
        lst.add(root.val);
        helper(root.right);
    }
}
