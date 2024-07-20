import java.util.*;
  public class BinaryTreeRightSideView {
      int val;
      BinaryTreeRightSideView left;
      BinaryTreeRightSideView right;
      BinaryTreeRightSideView() {}
      BinaryTreeRightSideView(int val) { this.val = val; }
      BinaryTreeRightSideView(int val, BinaryTreeRightSideView left, BinaryTreeRightSideView right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    List<Integer> lst = new ArrayList<>();
    public List<Integer> rightSideView(BinaryTreeRightSideView root) {
        if(root==null)return lst;
        helper(root,0);
        return lst;
    }
    public void helper(BinaryTreeRightSideView root, int level){
        if(root==null)return;
        if(level==lst.size())lst.add(root.val);
        helper(root.right,level+1);
        helper(root.left,level+1);
    }
    
}
