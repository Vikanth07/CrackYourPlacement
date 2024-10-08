package LinkedList;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode runner = new ListNode();
        ListNode temp = runner;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                runner.next=list1;
                list1=list1.next;
            }else{
                runner.next=list2;
                list2=list2.next;
            }
            runner=runner.next;
        }
        while(list1!=null){
            runner.next=list1;
            list1=list1.next;
            runner=runner.next;
        }
        while(list2!=null){
            runner.next=list2;
            list2=list2.next;
            runner=runner.next;
        }
        return temp.next;
    }
}