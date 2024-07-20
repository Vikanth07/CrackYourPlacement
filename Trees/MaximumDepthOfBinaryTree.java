public class MaximumDepthOfBinaryTree {
      int val;
      MaximumDepthOfBinaryTree left;
      MaximumDepthOfBinaryTree right;
      MaximumDepthOfBinaryTree() {}
      MaximumDepthOfBinaryTree(int val) { this.val = val; }
      MaximumDepthOfBinaryTree(int val, MaximumDepthOfBinaryTree left, MaximumDepthOfBinaryTree right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public int maxDepth(MaximumDepthOfBinaryTree root) {
        if(root==null)return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return Math.max(lh,rh)+1;
    }
}