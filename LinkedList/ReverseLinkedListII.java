package LinkedList;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode tail = null;
        ListNode dummyNode = new ListNode(-1);
        prev = dummyNode;
        dummyNode.next = head;
        for(int i=0; i<left-1; i++){
            prev = prev.next;
        }
        tail = prev.next;
        for(int i=0; i<right-left; i++){
            ListNode temp = prev.next;
            prev.next = tail.next;
            tail.next = tail.next.next;
            prev.next.next = temp;
        }
        return dummyNode.next;
    }
}
