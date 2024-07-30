package programming.linkedlist;

public class PalindromeLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode x = new ListNode(4);
        ListNode y = new ListNode(4);
        ListNode z = new ListNode(2);


        head.next = x;
        x.next = y;
        y.next = z;
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHead = slow.next;
        slow.next = reverse(secondHead);;
        ListNode dummy = head;
        slow = slow.next;
        while (slow != null) {
            if (slow.val != dummy.val) {
                return false;
            }
            slow = slow.next;
            dummy = dummy.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
