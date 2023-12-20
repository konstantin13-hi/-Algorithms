package LinkedList;

public class MiddleOfTheLinkedList {


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

    public static ListNode middleNode(ListNode head) {
        int k = 0;
        ListNode c =head;
        while (c !=null){
           c=c.next;
           k++;

        }
        c=head;
        System.out.println((k/2) +1);
        for (int i=0; i<(k/2)  ;i++){

            c = c.next;

        }
     return c;
    }

    public static void main(String[] args) {
       // ListNode six = new ListNode(6);
        ListNode fith = new ListNode(5);
        ListNode four = new ListNode(4,fith);
        ListNode third = new ListNode(3,four);
        ListNode second = new ListNode(2,third);
        ListNode head = new ListNode(1,second);




        System.out.println(middleNode(head).val);
    }

}
