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
 
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        targetSum-=root.val;
        if(targetSum==0 && root.left==null && root.right==null)return true;
        boolean left = hasPathSum(root.left,targetSum);
        boolean right = hasPathSum(root.right,targetSum);
        return left||right;

    }
}