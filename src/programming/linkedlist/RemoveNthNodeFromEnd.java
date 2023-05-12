package programming.linkedlist;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(6);
        ListNode temp1 = new ListNode(9);
        ListNode temp2 = new ListNode(2);
        ListNode temp3 = new ListNode(4);
        ListNode temp4 = new ListNode(5);


        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=null;

        removeNthFromEnd(head,2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while (temp!=null){
            len++;
            temp = temp.next;
        }
        System.out.println("Length : "+len);
        int fromStart = len - n + 1;
        temp = head;
        int counter = 0;
        if(fromStart == 1){
            head = head.next;
        }
        while (temp!=null){
            counter++;
            if(counter+1 == fromStart){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        System.out.println(head);
        return head;

    }

}


