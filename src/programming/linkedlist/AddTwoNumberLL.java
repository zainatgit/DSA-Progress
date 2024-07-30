package programming.linkedlist;

import java.util.Stack;

public class AddTwoNumberLL {
    public static void main(String[] args) {
        //243+564
        ListNode head = new ListNode(2);
        ListNode x = new ListNode(4);
        ListNode y = new ListNode(3);

        head.next = x;
        x.next = y;

        ListNode head2 = new ListNode(5);
        ListNode p = new ListNode(6);
        ListNode q = new ListNode(4);

        head2.next = p;
        p.next = q;

        ListNode res = usingTwoStack(head,head2);
        while (res !=null){
            System.out.println(res.val);
            res = res.next;
        }

    }

    private static ListNode usingTwoStack(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        //as number in LL are reverse so need to reverse them
        l1 = reverse(l1);
        l2 = reverse(l2);
        while(l1!=null){
            s1.add(l1.val);
            l1=l1.next;
        }

        while(l2!=null){
            s2.add(l2.val);
            l2=l2.next;
        }

        int carry = 0;
        ListNode res = new ListNode(-1);
        ListNode resHead = res;
        int a=0;
        int b=0;
        int total=0;
        while(!s1.isEmpty() || !s2.isEmpty()){
            a=0;
            b=0;
            if(!s1.isEmpty()){
                a = s1.pop();
            }
            if(!s2.isEmpty()){
                b = s2.pop();
            }

            total = a + b +carry;
            ListNode temp = new ListNode(total%10);
            carry = total/10;

            res.next = temp;
            res = res.next;
        }
        if(carry > 0){
            ListNode temp = new ListNode(carry);
            res.next = temp;
        }
        return resHead.next;
    }

    static ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
