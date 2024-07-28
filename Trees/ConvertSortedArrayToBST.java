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
 
public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
        return helper(nums, 0, nums.length-1);
    }
    public TreeNode helper(int[] nums, int lp, int rp){
        if(lp>rp){
            return null;
        }
        int mid = lp+(rp-lp)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, lp, mid-1);
        root.right = helper(nums,mid+1, rp);
        return root;
    }
}
