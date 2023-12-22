package LinkedList;

public class RemoveDuplicatesfromSortedList {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode first = head;
        ListNode current = head.next;
        while (current!=null){
            if(first.val == current.val){
                first.next=current.next;
                current.next = null;
            }
            else {
                first = first.next;
            }
            current =first.next;
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
       // head.next.next.next.next = new ListNode(1);
        ListNode node  =deleteDuplicates(head);
        while(node!=null){

            System.out.println(node.val);
            node =node.next;

        }

    }
}
