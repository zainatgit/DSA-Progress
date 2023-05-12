package programming.linkedlist;

public class ReorderList {
    public static void main(String[] args) {

    }


    public static void reorderList(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(head!=null){
            len++;
            temp=temp.next;
        }
        int mid = len/2;
        temp = head;
        ListNode head2 = null;
        for(int i=0; i<=mid;i++){
            if(mid == i){
                head2 = temp.next;
                temp.next = null;
            }
            temp = temp.next;
        }
        temp = head;
        ListNode temp2 = reverseList(head2);
        ListNode newHead = new ListNode(0);
        ListNode curr = newHead;
        while(temp !=null && temp2 !=null){
            if(temp!=null){
                curr.next = temp;
                temp = temp.next;
                curr = curr.next;
            }

            if(temp2!=null){
                curr.next = temp2;
                temp2 = temp2.next;
                curr = curr.next;
            }
        }

        newHead = newHead.next;

    }

    private static ListNode reverseList(ListNode head2) {
        ListNode cur=head2;
        ListNode prev = null;
        ListNode next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur=next;
        }
        return prev;
    }
}
