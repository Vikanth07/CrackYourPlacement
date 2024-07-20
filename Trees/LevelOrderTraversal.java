import java.util.*;
  public class LevelOrderTraversal {
      int val;
      LevelOrderTraversal left;
      LevelOrderTraversal right;
      LevelOrderTraversal() {}
      LevelOrderTraversal(int val) { this.val = val; }
      LevelOrderTraversal(int val, LevelOrderTraversal left, LevelOrderTraversal right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public List<List<Integer>> levelOrder(LevelOrderTraversal root) {
        List<List<Integer>> lst = new ArrayList<>();
        if(root==null)return lst;
        Queue<LevelOrderTraversal> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> lst1 = new ArrayList<>();
            int currLevel = q.size();
            for(int i=0; i<currLevel; i++){
                LevelOrderTraversal currNode = q.remove();
                lst1.add(currNode.val);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            lst.add(lst1);
        }
        return lst;
    }
}
