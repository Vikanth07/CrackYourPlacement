import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

public class MedianBST {
    public static float findMedian(Node root)
    {
        ArrayList<Integer> lst = new ArrayList<>();
        helper(root,lst);
        int n = lst.size();
        if(n%2==0){
            int mid1 = lst.get(n/2-1);
            int mid2 = lst.get(n/2);
            return (float)(mid1+mid2)/2;
        }
        return (float)lst.get(n/2);
        
        
    }
    public static void helper(Node root, ArrayList<Integer> lst){
        if(root==null)return;
        helper(root.left, lst);
        lst.add(root.data);
        helper(root.right, lst);
    }
}
