package programming.linkedlist;

public class RotateLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode result = rotate(l1,6);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode rotate(ListNode head, int k){
        if(head == null || k == 0){
            return head;
        }
        ListNode revHead = reverse(head);
        int count = 0;
        ListNode temp = revHead;
        ListNode newTemp = new ListNode();
        newTemp.next = temp;
        while(count < k){
            newTemp = newTemp.next;
            count++;
        }
        ListNode secondHead = newTemp.next;
        newTemp.next = null;
        ListNode finalFirstHead = reverse(temp);
        ListNode finalSecondHead = reverse(secondHead);
        ListNode finalTemp = finalFirstHead;
        while(finalTemp.next!=null){
            finalTemp = finalTemp.next;
        }
        finalTemp.next = finalSecondHead;
        return finalFirstHead;
    }

    public static ListNode reverse(ListNode head){
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
