package Trees;


  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode leftNode, TreeNode rightNode){
        if(leftNode==null && rightNode==null)return true;
        if(leftNode==null || rightNode==null)return false;
        return leftNode.val==rightNode.val && helper(leftNode.right, rightNode.left) && helper(leftNode.left, rightNode.right);
    }
}
