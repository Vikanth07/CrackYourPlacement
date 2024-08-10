package LinkedList;

class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}

public class DeleteNodesGreaterOnRight {
    Node compute(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        int maxi = head.data;
        Node prev1 = head;
        Node curr1 = head.next;
        while(curr1!=null){
            if(curr1.data>=maxi){
                prev1 = curr1;
                maxi = Math.max(maxi,curr1.data);
            }else{
                prev1.next = curr1.next;
            }
            curr1 = curr1.next;
        }
        prev = null;
        curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
