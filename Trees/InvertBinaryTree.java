public class InvertBinaryTree {
      int val;
      InvertBinaryTree left;
      InvertBinaryTree right;
      InvertBinaryTree() {}
      InvertBinaryTree(int val) { this.val = val; }
      InvertBinaryTree(int val, InvertBinaryTree left, InvertBinaryTree right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }
}
class Solution {
    public InvertBinaryTree invertTree(InvertBinaryTree root) {
        if(root==null){
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        InvertBinaryTree temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}