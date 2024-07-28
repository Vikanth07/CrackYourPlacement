package LinkedList;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class ConvertBinaryNumToInteger {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp!=null){
            sb.append(temp.val);
            temp=temp.next;
        }
        int num = Integer.parseInt(sb.toString(), 2);
        return num;
    }
}