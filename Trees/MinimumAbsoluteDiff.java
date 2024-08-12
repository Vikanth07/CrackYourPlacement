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
 
public class MinimumAbsoluteDiff {
    TreeNode prev = null;
    int ans = Integer.MAX_VALUE;
    public void inOrder(TreeNode root){
        if(root==null)return ;
        inOrder(root.left);
        if(prev!=null){
            ans = Math.min(ans, root.val-prev.val);
        }
        prev = root;
        inOrder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }
}
