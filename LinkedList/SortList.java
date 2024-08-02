package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class SortList {
    public ListNode sortList(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            lst.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(lst);
        ListNode dummyNode = new ListNode(-1);
        temp = dummyNode;
        for(int i=0; i<lst.size(); i++){
            ListNode newNode = new ListNode(lst.get(i));
            temp.next = newNode;
            temp = temp.next;
        }
        return dummyNode.next;
    }
}
