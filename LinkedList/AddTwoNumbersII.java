package LinkedList;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = reverseList(l1);
        ListNode t2 = reverseList(l2);
        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;
        int carry=0;
        while(t1!=null || t2!=null){
            int sum = carry;
            if(t1!=null) sum = sum+t1.val;
            if(t2!=null) sum = sum+t2.val;
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            curr.next = newNode;
            curr = curr.next;
            if(t1!=null)t1=t1.next;
            if(t2!=null)t2=t2.next;
        }
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }
        return reverseList(dummyNode.next);
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
