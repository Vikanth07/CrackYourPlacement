package LinkedList;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class ReverseNodesInKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode=null;
        ListNode nextNode = null;
        while(temp!=null){
            ListNode kthNode = getKthNode(temp,k);
            if(kthNode==null){
                if(prevNode!=null)prevNode.next = nextNode;
                break;
            }
            nextNode = kthNode.next;
            kthNode.next = null;
            reverseList(temp);
            if(temp==head){
                head = kthNode;
            }else{
                prevNode.next=kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
    public ListNode getKthNode(ListNode temp, int k){
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseList(ListNode temp){
        ListNode prev = null;
        ListNode curr = temp;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
