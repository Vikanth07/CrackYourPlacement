
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

public class BSTNodesInRange {
    int getCount(Node root,int l, int h)
    {
        if(root==null)return 0;
        int cnt=0;
        if(root.data>=l && root.data<=h)cnt++;
        cnt+=getCount(root.left,l,h);
        cnt+=getCount(root.right,l,h);
        return cnt;
    }
}
